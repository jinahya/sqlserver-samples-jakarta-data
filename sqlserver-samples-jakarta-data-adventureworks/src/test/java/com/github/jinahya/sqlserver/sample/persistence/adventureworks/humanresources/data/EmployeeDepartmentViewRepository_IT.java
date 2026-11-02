package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeeDepartmentView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.EmployeeDepartmentViewRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmployeeDepartmentViewRepository}.
 */
@AddBeanClasses(EmployeeDepartmentViewRepository_.class)
class EmployeeDepartmentViewRepository_IT
        extends _Repository_IT<EmployeeDepartmentViewRepository, EmployeeDepartmentView, Integer> {

    EmployeeDepartmentViewRepository_IT() {
        super(EmployeeDepartmentViewRepository.class, EmployeeDepartmentView.class, Integer.class);
    }
}
