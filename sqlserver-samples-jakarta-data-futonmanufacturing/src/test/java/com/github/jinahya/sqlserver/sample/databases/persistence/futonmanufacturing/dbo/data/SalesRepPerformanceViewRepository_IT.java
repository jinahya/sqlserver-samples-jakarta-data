package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesRepPerformanceView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesRepPerformanceViewRepository}.
 */
@AddBeanClasses(SalesRepPerformanceViewRepository_.class)
class SalesRepPerformanceViewRepository_IT
        extends _Repository_IT<SalesRepPerformanceViewRepository, SalesRepPerformanceView, String> {

    SalesRepPerformanceViewRepository_IT() {
        super(SalesRepPerformanceViewRepository.class, SalesRepPerformanceView.class, String.class);
    }
}
