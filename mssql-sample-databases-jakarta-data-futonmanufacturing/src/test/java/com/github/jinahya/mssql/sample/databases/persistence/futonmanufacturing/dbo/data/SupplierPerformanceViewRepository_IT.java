package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SupplierPerformanceView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SupplierPerformanceViewRepository}.
 */
@AddBeanClasses(SupplierPerformanceViewRepository_.class)
class SupplierPerformanceViewRepository_IT
        extends _Repository_IT<SupplierPerformanceViewRepository, SupplierPerformanceView, String> {

    SupplierPerformanceViewRepository_IT() {
        super(SupplierPerformanceViewRepository.class, SupplierPerformanceView.class, String.class);
    }
}
