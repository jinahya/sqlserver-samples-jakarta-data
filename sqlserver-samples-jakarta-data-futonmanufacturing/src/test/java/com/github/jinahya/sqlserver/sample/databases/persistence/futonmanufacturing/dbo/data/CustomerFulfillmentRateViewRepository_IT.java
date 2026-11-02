package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.CustomerFulfillmentRateView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CustomerFulfillmentRateViewRepository}.
 */
@AddBeanClasses(CustomerFulfillmentRateViewRepository_.class)
class CustomerFulfillmentRateViewRepository_IT
        extends _Repository_IT<CustomerFulfillmentRateViewRepository, CustomerFulfillmentRateView, String> {

    CustomerFulfillmentRateViewRepository_IT() {
        super(CustomerFulfillmentRateViewRepository.class, CustomerFulfillmentRateView.class, String.class);
    }
}
