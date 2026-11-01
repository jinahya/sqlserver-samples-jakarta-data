package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.EmployeePayHistory;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.humanresources.MappedEmployeePayHistoryId;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmployeePayHistoryRepository}.
 */
@AddBeanClasses(EmployeePayHistoryRepository_.class)
class EmployeePayHistoryRepository_IT
        extends _Repository_IT<EmployeePayHistoryRepository, EmployeePayHistory, MappedEmployeePayHistoryId> {

    EmployeePayHistoryRepository_IT() {
        super(EmployeePayHistoryRepository.class, EmployeePayHistory.class, MappedEmployeePayHistoryId.class);
    }
}
