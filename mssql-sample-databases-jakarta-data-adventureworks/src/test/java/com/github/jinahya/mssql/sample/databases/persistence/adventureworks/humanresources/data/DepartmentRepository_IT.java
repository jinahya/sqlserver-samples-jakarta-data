package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.Department;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link DepartmentRepository}.
 */
@AddBeanClasses(DepartmentRepository_.class)
class DepartmentRepository_IT
        extends _Repository_IT<DepartmentRepository, Department, Short> {

    DepartmentRepository_IT() {
        super(DepartmentRepository.class, Department.class, Short.class);
    }
}
