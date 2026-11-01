package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.dbo.AwBuildVersion;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link AwBuildVersion}.
 */
@Repository
public interface AwBuildVersionRepository
        extends _Repository<AwBuildVersion, Short>,
                CrudRepository<AwBuildVersion, Short> {

}
