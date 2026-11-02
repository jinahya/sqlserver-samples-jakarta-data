package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.DatabaseLog;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link DatabaseLog}.
 */
@Repository
public interface DatabaseLogRepository
        extends _Repository<DatabaseLog, Long>,
                CrudRepository<DatabaseLog, Long> {

}
