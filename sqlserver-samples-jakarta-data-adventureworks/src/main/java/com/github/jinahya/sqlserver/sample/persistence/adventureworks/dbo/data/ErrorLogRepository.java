package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.ErrorLog;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ErrorLog}.
 */
@Repository
public interface ErrorLogRepository
        extends _Repository<ErrorLog, Long>,
                CrudRepository<ErrorLog, Long> {

}
