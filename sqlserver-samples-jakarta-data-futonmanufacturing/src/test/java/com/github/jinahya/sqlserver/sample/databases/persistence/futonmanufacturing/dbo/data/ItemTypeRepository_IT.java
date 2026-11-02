package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ItemType;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ItemTypeRepository}.
 */
@AddBeanClasses(ItemTypeRepository_.class)
class ItemTypeRepository_IT
        extends _Repository_IT<ItemTypeRepository, ItemType, Integer> {

    ItemTypeRepository_IT() {
        super(ItemTypeRepository.class, ItemType.class, Integer.class);
    }
}
