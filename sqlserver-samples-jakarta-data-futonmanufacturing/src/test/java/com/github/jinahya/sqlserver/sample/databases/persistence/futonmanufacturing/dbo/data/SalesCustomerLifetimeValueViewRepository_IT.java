package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerLifetimeValueView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesCustomerLifetimeValueViewRepository}.
 */
@AddBeanClasses(SalesCustomerLifetimeValueViewRepository_.class)
class SalesCustomerLifetimeValueViewRepository_IT
        extends _Repository_IT<SalesCustomerLifetimeValueViewRepository, SalesCustomerLifetimeValueView, Integer> {

    SalesCustomerLifetimeValueViewRepository_IT() {
        super(SalesCustomerLifetimeValueViewRepository.class, SalesCustomerLifetimeValueView.class, Integer.class);
    }
}
