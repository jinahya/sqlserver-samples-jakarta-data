package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.DatabaseLog;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data.DatabaseLogRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link DatabaseLogRepository}.
 */
@AddBeanClasses(DatabaseLogRepository_.class)
class DatabaseLogRepository_IT
        extends _Repository_IT<DatabaseLogRepository, DatabaseLog, Long> {

    DatabaseLogRepository_IT() {
        super(DatabaseLogRepository.class, DatabaseLog.class, Long.class);
    }
}
