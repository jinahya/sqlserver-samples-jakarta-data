package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockItem;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StockItemRepository}.
 */
@AddBeanClasses(StockItemRepository_.class)
class StockItemRepository_IT
        extends _Repository_IT<StockItemRepository, StockItem, Integer> {

    StockItemRepository_IT() {
        super(StockItemRepository.class, StockItem.class, Integer.class);
    }
}
