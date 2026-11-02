package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerAnalysisView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesCustomerAnalysisViewRepository}.
 */
@AddBeanClasses(SalesCustomerAnalysisViewRepository_.class)
class SalesCustomerAnalysisViewRepository_IT
        extends _Repository_IT<SalesCustomerAnalysisViewRepository, SalesCustomerAnalysisView, Integer> {

    SalesCustomerAnalysisViewRepository_IT() {
        super(SalesCustomerAnalysisViewRepository.class, SalesCustomerAnalysisView.class, Integer.class);
    }
}
