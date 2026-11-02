package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesCustomerSegmentationView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesCustomerSegmentationViewRepository;
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
