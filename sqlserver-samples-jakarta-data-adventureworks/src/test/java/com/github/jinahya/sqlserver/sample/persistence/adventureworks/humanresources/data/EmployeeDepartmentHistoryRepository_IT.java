package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeeDepartmentHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.humanresources.MappedEmployeeDepartmentHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.EmployeeDepartmentHistoryRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmployeeDepartmentHistoryRepository}.
 */
@AddBeanClasses(EmployeeDepartmentHistoryRepository_.class)
class EmployeeDepartmentHistoryRepository_IT
        extends _Repository_IT<EmployeeDepartmentHistoryRepository, EmployeeDepartmentHistory, MappedEmployeeDepartmentHistoryId> {

    EmployeeDepartmentHistoryRepository_IT() {
        super(EmployeeDepartmentHistoryRepository.class, EmployeeDepartmentHistory.class, MappedEmployeeDepartmentHistoryId.class);
    }
}
