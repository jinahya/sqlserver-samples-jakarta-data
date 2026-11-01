package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.InventoryValuationView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link InventoryValuationViewRepository}.
 */
@AddBeanClasses(InventoryValuationViewRepository_.class)
class InventoryValuationViewRepository_IT
        extends _Repository_IT<InventoryValuationViewRepository, InventoryValuationView, String> {

    InventoryValuationViewRepository_IT() {
        super(InventoryValuationViewRepository.class, InventoryValuationView.class, String.class);
    }
}
