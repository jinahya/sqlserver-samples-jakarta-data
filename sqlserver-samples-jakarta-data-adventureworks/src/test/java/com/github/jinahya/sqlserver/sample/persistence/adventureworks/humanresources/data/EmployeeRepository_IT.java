package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.Employee;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.EmployeeRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmployeeRepository}.
 */
@AddBeanClasses(EmployeeRepository_.class)
class EmployeeRepository_IT
        extends _Repository_IT<EmployeeRepository, Employee, Integer> {

    EmployeeRepository_IT() {
        super(EmployeeRepository.class, Employee.class, Integer.class);
    }
}
