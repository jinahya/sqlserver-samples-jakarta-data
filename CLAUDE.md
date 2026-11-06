# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this project is

Jakarta Data 1.0 repositories over the Jakarta Persistence mappings of
[`sqlserver-samples-persistence`](https://github.com/jinahya/sqlserver-samples-persistence), which maps
the Microsoft SQL Server sample databases. A parent-less multi-module Maven project, one module per database, as
upstream:

- `sqlserver-samples-jakarta-data-adventureworks` (AdventureWorks; 82 entities)
- `sqlserver-samples-jakarta-data-futonmanufacturing` (FutonManufacturing; 50 entities)
- `sqlserver-samples-jakarta-data-wideworldimporters` (WideWorldImporters; 34 entities)

The root `pom.xml` (`io.github.jinahya:sqlserver-samples-jakarta-data`) is the aggregator and the parent of the
three. Shared versions live in its `properties` / `dependencyManagement` / `pluginManagement`; the dependencies every
module needs (the `provided` APIs, the test frameworks, the driver) are declared once in its `dependencies`. Each
module declares only its upstream module (`sqlserver-samples-persistence-<db>`). The shape follows the sibling
`../postgresql-demodb-jakarta-data`, except that this project has no H2 and no unit tests.

Packages, per module (`<db>` is `adventureworks`, `futonmanufacturing` or `wideworldimporters`):

- `com.github.jinahya.sqlserver.sample.persistence.<db>.<schema>`: the entities, **in this project's
  `src/main`**, one package per schema (`dbo`, `sales`, ...).
- `com.github.jinahya.sqlserver.sample.persistence.<db>.<schema>.data`: the repositories of that schema's
  entities (`@NullMarked`, JSpecify).
- `com.github.jinahya.sqlserver.sample.persistence.<db>.data`: `_Repository<T, K>`, the unannotated base of
  every repository of the module (`@NullMarked`), and, in `src/test`, the test bases.

A repository per schema package, not one `data` package per module: WideWorldImporters has entities of the same
simple name in two schemas (`sales.Customer` and `website.Customer`, ...), whose repositories would clash.

## The repositories

- One per entity, `<Entity>Repository`, annotated `@Repository`. Each extends **both** `_Repository<Entity, Id>` **and**
  `CrudRepository<Entity, Id>` directly. Drop the direct `CrudRepository` and `hibernate-processor` fails with
  "repository does not have a well-defined primary entity type for inherited member 'deleteById'".
- The id type is the type of the `@Id` attribute of the entity's mapped superclass (`Integer`, `Long`, `String`), or,
  for an entity with an `@IdClass` or an `@EmbeddedId`, upstream's `<Entity>Id` class (`EmployeePayHistoryId`, in
  upstream's `<db>.mapped.<schema>`).
- **One provider, no provider profiles.** Hibernate Data Repositories is the only Jakarta Data provider for Java SE:
  `hibernate-processor` implements every `@Repository` interface at compile time as a `<Name>_` class under
  `target/generated-sources/annotations`, which runs on an `org.hibernate.StatelessSession`. EclipseLink 5.0 has no
  Jakarta Data, so unlike upstream there is no EclipseLink axis here.
- **The processor's Jakarta Data metamodel is suppressed** (`-AsuppressJakartaDataMetamodel=true` in the root pom):
  with `jakarta.data` on the classpath the processor would also write `_Customer extends _MappedCustomer`, and
  upstream, compiled without `jakarta.data`, never generated `_MappedCustomer`. The repositories are generated against
  the Jakarta Persistence metamodel (`Customer_`, extending upstream's `MappedCustomer_`). The option is reported
  as unrecognized on `testCompile`, where no processor runs; that warning is harmless.
- No repository names a `dataStore`; the unit is the caller's choice. The generated `<Name>_` has a `public`
  constructor taking a `StatelessSession` (container-free use) and an `@Inject` no-arg constructor that opens its
  session from a `@PersistenceUnit` (CDI use).
- The published jars carry **the entities and the repositories**. `jakarta.data-api`, `jakarta.persistence-api`,
  `jakarta.validation-api`, `jakarta.annotation-api` (the entities' `@Nullable`), `jakarta.inject-api`, `cdi-api`,
  `hibernate-core` and `jspecify` are all `provided`.
- `-parameters` is on (`maven.compiler.parameters`), as upstream: Jakarta Data binds query parameters by name.

## Upstream, and the entities

The upstream checkout `../../sqlserver-samples-persistence` publishes, at `0.0.1-SNAPSHOT`, one jar per database of
**mapped superclasses (`<db>.mapped.<schema>.Mapped*`), their `<Entity>Id` id classes, their generated static
metamodel, and their attribute converters**, with the `geography` and `hierarchyid` converters in the shared
`sqlserver-samples-persistence-common` jar. They exist **only in the local `~/.m2`**: after any change upstream, run
`./mvnw -DskipTests install` there before building here. Each module's `persistence.xml` lists the converters
upstream's lists.

- **Upstream keeps its entities in `src/test`**, on purpose: which associations an entity maps is an application's
  decision, and this project is that application. The entities here are verbatim copies of upstream's test
  `@Entity` classes (`src/test/java/.../<db>/<schema>/<Entity>.java` there), in the same package. **Keep them in step
  with upstream**: diff against upstream's before touching a mapping, and change the mapping there first.
- **The copies are upstream HEAD's test entities, verbatim, with nothing of this project's own.** A member upstream
  does not have (a named query, a method) is added to a copy only where this project uses it, by a repository method or
  a test, and is named here; there is none so far. Before taking a difference from upstream for an addition of this
  project's, find the upstream commit the copy matches: an old copy carries what upstream had then (the `@Nullable`s
  and javadoc of upstream's c6fbfd6, which the copies carried until they
  were brought to upstream's current ones). What a
  copy needs of upstream's `src/test` besides the entities is copied too, into `src/main/java` in the same package;
  the id classes (`<Entity>Id`) are not, since upstream's main jar has them.
- Upstream's test package also holds keyless plain classes (views without a key, the `*_Archive` history tables,
  `ProductDocument`). They are not entities, are not copied, and have no repository.
- This project uses no test-companion jar of upstream's. Upstream tests each mapping on H2 (`<db>-test`, surefire)
  and on SQL Server (`<db>-it`, failsafe); this project's tests are ITs on SQL Server only, on a `<db>-it` unit of its
  own.
- The version properties in `pom.xml` (Hibernate ORM `7.4.15.Final`, `mssql-jdbc` `13.6.2.jre11`, Hibernate Validator,
  JUnit, AssertJ, ...) deliberately mirror upstream's. Change them in step with upstream, not independently.
- Read `../../sqlserver-samples-persistence/README.md` before touching anything about the mappings.

## Build

Maven wrapper (`./mvnw`); the build JDK must be **25** (enforced). Main and test sources both compile at release 25.
Both scripts run `clean` on purpose: a renamed or removed `@Repository` interface leaves a stale generated `<Name>_`
class that the next incremental compile fails on with an unexplained "cannot find symbol".

```sh
./_mvn_verify.sh                       # compile, package, and the integration tests (*IT) against SQL Server
./_mvn_verify_notests.sh               # full lifecycle, tests compiled but not run; no database needed
./_mvn_verify.sh -pl sqlserver-samples-jakarta-data-adventureworks                        # one module
./_mvn_verify.sh -pl sqlserver-samples-jakarta-data-adventureworks -Dit.test=PersonRepository_IT
```

Failsafe is bound only by the `failsafe` profile (`-Pfailsafe`), picking up `**/*IT.java`; a plain `./mvnw verify`
never runs an IT. As of surefire/failsafe 3.6.0, `-DskipTests` reaches surefire only, so `-DskipITs` is the flag
that stops the ITs. Both plugins stop after the first failing class (`tests.skipAfterFailureCount`, 1). The enforcer
fails the build on dependency non-convergence, a JDK below 25, and a `-P` naming a profile that does not exist.

**The integration tests need the SQL Server container upstream owns**: run
`../../sqlserver-samples-persistence/_compose.sh` (Ctrl-C takes it down with its data). It serves the three
databases on `localhost:1433`, `sa` / `Passw0rd!`. Each module's `<db>-it` unit connects there with
`hbm2ddl.auto=none`: the sample data is the fixture the ITs read, and nothing may touch the schema or leave rows
behind.

## Tests

ITs only. One `<Entity>Repository_IT` per repository, in the repository's package, extending
`<db>.data._Repository_IT<R, T, K>`:

```java
@AddBeanClasses(CustomerRepository_.class)
class CustomerRepository_IT
        extends _Repository_IT<CustomerRepository, Customer, Integer> {

    CustomerRepository_IT() {
        super(CustomerRepository.class, Customer.class, Integer.class);
    }
}
```

A Weld SE container per test method (`@EnableAutoWeld` on `__Repository_TestBase<R, T, K>`). The container creates
the generated `<R>_` through its `@Inject` constructor; `getRepositoryInstance()` returns it, one `@Dependent` instance
(and `StatelessSession`) per test. `_Repository_IT` adds, with an inherited `@AddBeanClasses`, a nested
`EntityManagerFactoryProducer` for the `<db>-it` unit. The bases are `public` with `protected` members, since the
concrete ITs live in the schema packages. Three things are load-bearing:

- `<R>_` takes the factory from a `@PersistenceUnit` field, resource injection that no producer reaches and Weld SE
  does not fill. `__WeldJpaInjectionServices`, a test-only Weld `JpaInjectionServices` registered in
  `src/test/resources/META-INF/services/org.jboss.weld.bootstrap.api.Service`, hands it the produced factory. Without
  it the field stays `null` (NPE in the generated `@PostConstruct`).
- The producer is `@Singleton`, not `@ApplicationScoped`: `<R>_`'s `unwrap(SessionFactory.class)` on a client proxy
  throws `ClassCastException`.
- The base does not `@Inject R`: an injection point typed by a type variable is a CDI definition error
  (WELD-001407), even when the subclass binds it. It injects `Instance<Object>` and selects `repositoryClass`.

- `META-INF/persistence.xml`: one unit per module, `<db>-it` (SQL Server, `none`), mirroring upstream's; keep the
  two files in step. It lists upstream's converter and every entity explicitly, since `exclude-unlisted-classes` is
  on.
- `logback-test.xml`: root DEBUG, Hibernate at WARN except `org.hibernate.SQL` (DEBUG) and
  `org.hibernate.orm.jdbc.bind` (TRACE) for statements and bind values.
