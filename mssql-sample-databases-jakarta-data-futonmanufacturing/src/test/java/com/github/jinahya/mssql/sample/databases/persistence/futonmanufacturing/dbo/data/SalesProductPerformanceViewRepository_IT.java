package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesProductPerformanceView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesProductPerformanceViewRepository}.
 */
@AddBeanClasses(SalesProductPerformanceViewRepository_.class)
class SalesProductPerformanceViewRepository_IT
        extends _Repository_IT<SalesProductPerformanceViewRepository, SalesProductPerformanceView, String> {

    SalesProductPerformanceViewRepository_IT() {
        super(SalesProductPerformanceViewRepository.class, SalesProductPerformanceView.class, String.class);
    }
}
