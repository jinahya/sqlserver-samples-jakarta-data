package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.InventoryValuationView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.InventoryValuationViewRepository;
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
