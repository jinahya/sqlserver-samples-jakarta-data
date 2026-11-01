# mssql-sample-databases-jakarta-data

[Jakarta Data](https://jakarta.ee/specifications/data/1.0/) repositories of the Microsoft SQL Server sample databases
(AdventureWorks, WideWorldImporters, FutonManufacturing), over the mapped superclasses of
[mssql-sample-databases-persistence](https://github.com/jinahya/mssql-sample-databases-persistence).

The sibling [mssql-sample-databases-spring-data](https://github.com/jinahya/mssql-sample-databases-spring-data) does
the same in Spring Data JPA.

## The modules

One per database, as upstream:

| module                                                 | upstream module                                         | entities |
|--------------------------------------------------------|---------------------------------------------------------|---------:|
| `mssql-sample-databases-jakarta-data-adventureworks`     | `mssql-sample-databases-persistence-adventureworks`     |       82 |
| `mssql-sample-databases-jakarta-data-futonmanufacturing` | `mssql-sample-databases-persistence-futonmanufacturing` |       50 |
| `mssql-sample-databases-jakarta-data-wideworldimporters` | `mssql-sample-databases-persistence-wideworldimporters` |       34 |

The root `pom.xml` is both the aggregator and the parent of the three; each module depends on its upstream module
only.

## The entities

Upstream publishes mapped superclasses (`MappedCustomer`, ...), their static metamodel, the `Mapped*Id` id classes
and a converter, and keeps its entities in its test sources: which associations to map, and how, is an application's
decision. This project is that application. Each module's entities, one package per schema
(`com.github.jinahya.mssql.sample.databases.persistence.<db>.<schema>`), are copies of upstream's test entities,
kept in step with them. Upstream's keyless classes (views without a key, the `*_Archive` history tables,
`ProductDocument`) are not entities and are not copied.

## The repositories

One per entity, `<Entity>Repository`, in the `data` package of its schema
(`com.github.jinahya.mssql.sample.databases.persistence.<db>.<schema>.data`). Each extends `_Repository<E, K>`, of
`com.github.jinahya.mssql.sample.databases.persistence.<db>.data`, and `CrudRepository<E, K>`. `K` is the type of the
entity's `@Id`, or its `Mapped*Id` class for an entity with an `@IdClass`.

## The provider

One: [Hibernate Data Repositories](https://docs.hibernate.org/orm/7.4/repositories/html_single/Hibernate_Data_Repositories.html).
`hibernate-processor` implements every `@Repository` interface at compile time as a `<Name>_` class, which runs on
a `StatelessSession` of Hibernate ORM. EclipseLink 5.0 implements Jakarta Persistence 3.2 only, no Jakarta Data,
so unlike upstream this build has no provider profiles.

## The database

Upstream owns the container:

```shell
$ cd ../../mssql-sample-databases-persistence && ./compose.sh
```

brings up SQL Server on `localhost:1433` as `sa` / `Passw0rd!`, with the three databases loaded; Ctrl-C takes it down
again. The `<db>-it` unit of each module's `src/test/resources/META-INF/persistence.xml` points there.

## Building

```shell
$ ./_mvn_verify.sh            # compile, package and the integration tests, against the database above
$ ./_mvn_verify_notests.sh    # no database needed
```

There are no unit tests: every test is an integration test (`*_IT`) on SQL Server.

The upstream jars are local `SNAPSHOT`s: `./mvnw -DskipTests install` in `../../mssql-sample-databases-persistence`
first.
