#!/bin/sh
# Runs `verify` on every module: compile, hibernate-processor generating the metamodel and the repository
# implementations, package, enforcer, and the integration tests (*IT).
#
# There are no unit tests; every test needs the database. The ITs talk to the SQL Server upstream owns, at
# localhost:1433 (the `<db>-it` unit of each module's src/test/resources/META-INF/persistence.xml); bring it up with
#
#     cd ../mssql-sample-databases-persistence && ./compose.sh
#
# first; otherwise they fail on the connection rather than on a query.
#
# `failsafe` is the profile that binds maven-failsafe-plugin. One module, or one IT:
#
#     ./_mvn_verify.sh -pl mssql-sample-databases-jakarta-data-adventureworks
#     ./_mvn_verify.sh -pl mssql-sample-databases-jakarta-data-adventureworks -Dit.test=PersonRepository_IT
#
# `clean` is deliberate. The processor writes a <Repository>_ class per @Repository interface, and a renamed or
# removed interface leaves its stale implementation under target/generated-sources, which the next compile picks
# up and fails on with "cannot find symbol" -- a failure silent about its cause.
cd "$(dirname "$0")" || exit 1

exec ./mvnw -Pfailsafe clean verify "$@"
