package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.Item;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ItemRepository}.
 */
@AddBeanClasses(ItemRepository_.class)
class ItemRepository_IT
        extends _Repository_IT<ItemRepository, Item, Integer> {

    ItemRepository_IT() {
        super(ItemRepository.class, Item.class, Integer.class);
    }
}
