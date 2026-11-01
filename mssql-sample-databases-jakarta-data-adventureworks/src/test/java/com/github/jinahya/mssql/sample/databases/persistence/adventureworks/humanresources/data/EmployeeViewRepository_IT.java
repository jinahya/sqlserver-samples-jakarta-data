package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.EmployeeView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmployeeViewRepository}.
 */
@AddBeanClasses(EmployeeViewRepository_.class)
class EmployeeViewRepository_IT
        extends _Repository_IT<EmployeeViewRepository, EmployeeView, Integer> {

    EmployeeViewRepository_IT() {
        super(EmployeeViewRepository.class, EmployeeView.class, Integer.class);
    }
}
