package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.StockItemStockGroup;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StockItemStockGroupRepository}.
 */
@AddBeanClasses(StockItemStockGroupRepository_.class)
class StockItemStockGroupRepository_IT
        extends _Repository_IT<StockItemStockGroupRepository, StockItemStockGroup, Integer> {

    StockItemStockGroupRepository_IT() {
        super(StockItemStockGroupRepository.class, StockItemStockGroup.class, Integer.class);
    }
}
