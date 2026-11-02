package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerSegmentationView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesCustomerSegmentationViewRepository}.
 */
@AddBeanClasses(SalesCustomerSegmentationViewRepository_.class)
class SalesCustomerSegmentationViewRepository_IT
        extends _Repository_IT<SalesCustomerSegmentationViewRepository, SalesCustomerSegmentationView, Integer> {

    SalesCustomerSegmentationViewRepository_IT() {
        super(SalesCustomerSegmentationViewRepository.class, SalesCustomerSegmentationView.class, Integer.class);
    }
}
