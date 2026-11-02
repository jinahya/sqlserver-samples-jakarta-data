package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.ErrorLog;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ErrorLog}.
 */
@Repository
public interface ErrorLogRepository
        extends _Repository<ErrorLog, Integer>,
                CrudRepository<ErrorLog, Integer> {

}
