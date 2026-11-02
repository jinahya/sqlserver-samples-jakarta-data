package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesReturnsAnalysisView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesReturnsAnalysisViewRepository}.
 */
@AddBeanClasses(SalesReturnsAnalysisViewRepository_.class)
class SalesReturnsAnalysisViewRepository_IT
        extends _Repository_IT<SalesReturnsAnalysisViewRepository, SalesReturnsAnalysisView, Integer> {

    SalesReturnsAnalysisViewRepository_IT() {
        super(SalesReturnsAnalysisViewRepository.class, SalesReturnsAnalysisView.class, Integer.class);
    }
}
