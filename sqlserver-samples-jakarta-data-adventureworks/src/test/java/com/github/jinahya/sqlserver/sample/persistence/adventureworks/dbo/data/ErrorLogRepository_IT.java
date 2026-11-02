package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.ErrorLog;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data.ErrorLogRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ErrorLogRepository}.
 */
@AddBeanClasses(ErrorLogRepository_.class)
class ErrorLogRepository_IT
        extends _Repository_IT<ErrorLogRepository, ErrorLog, Long> {

    ErrorLogRepository_IT() {
        super(ErrorLogRepository.class, ErrorLog.class, Long.class);
    }
}
