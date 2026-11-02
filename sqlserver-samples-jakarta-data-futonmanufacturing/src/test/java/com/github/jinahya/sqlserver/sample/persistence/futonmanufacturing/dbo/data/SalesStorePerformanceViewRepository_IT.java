package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesStorePerformanceView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesStorePerformanceViewRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesStorePerformanceViewRepository}.
 */
@AddBeanClasses(SalesStorePerformanceViewRepository_.class)
class SalesStorePerformanceViewRepository_IT
        extends _Repository_IT<SalesStorePerformanceViewRepository, SalesStorePerformanceView, String> {

    SalesStorePerformanceViewRepository_IT() {
        super(SalesStorePerformanceViewRepository.class, SalesStorePerformanceView.class, String.class);
    }
}
