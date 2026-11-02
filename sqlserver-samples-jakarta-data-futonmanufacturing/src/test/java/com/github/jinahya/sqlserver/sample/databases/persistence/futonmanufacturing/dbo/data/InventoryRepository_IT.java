package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.Inventory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link InventoryRepository}.
 */
@AddBeanClasses(InventoryRepository_.class)
class InventoryRepository_IT
        extends _Repository_IT<InventoryRepository, Inventory, Integer> {

    InventoryRepository_IT() {
        super(InventoryRepository.class, Inventory.class, Integer.class);
    }
}
