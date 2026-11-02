package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesPersonView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesPersonViewRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesPersonViewRepository}.
 */
@AddBeanClasses(SalesPersonViewRepository_.class)
class SalesPersonViewRepository_IT
        extends _Repository_IT<SalesPersonViewRepository, SalesPersonView, Integer> {

    SalesPersonViewRepository_IT() {
        super(SalesPersonViewRepository.class, SalesPersonView.class, Integer.class);
    }
}
