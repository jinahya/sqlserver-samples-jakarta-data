package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.ErrorLog;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ErrorLogRepository}.
 */
@AddBeanClasses(ErrorLogRepository_.class)
class ErrorLogRepository_IT
        extends _Repository_IT<ErrorLogRepository, ErrorLog, Integer> {

    ErrorLogRepository_IT() {
        super(ErrorLogRepository.class, ErrorLog.class, Integer.class);
    }
}
