package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.AwBuildVersion;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link AwBuildVersion}.
 */
@Repository
public interface AwBuildVersionRepository
        extends _Repository<AwBuildVersion, Long>,
                CrudRepository<AwBuildVersion, Long> {

}
