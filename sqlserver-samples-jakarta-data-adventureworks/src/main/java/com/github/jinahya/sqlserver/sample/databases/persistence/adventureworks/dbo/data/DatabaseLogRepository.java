package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.DatabaseLog;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link DatabaseLog}.
 */
@Repository
public interface DatabaseLogRepository
        extends _Repository<DatabaseLog, Integer>,
                CrudRepository<DatabaseLog, Integer> {

}
