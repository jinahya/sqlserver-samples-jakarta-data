package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.StockItemHolding;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data.StockItemHoldingRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StockItemHoldingRepository}.
 */
@AddBeanClasses(StockItemHoldingRepository_.class)
class StockItemHoldingRepository_IT
        extends _Repository_IT<StockItemHoldingRepository, StockItemHolding, Integer> {

    StockItemHoldingRepository_IT() {
        super(StockItemHoldingRepository.class, StockItemHolding.class, Integer.class);
    }
}
