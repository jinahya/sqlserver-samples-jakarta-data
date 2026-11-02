package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeeView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.EmployeeViewRepository;
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
