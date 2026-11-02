package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.StockItemStockGroup;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data.StockItemStockGroupRepository;
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
