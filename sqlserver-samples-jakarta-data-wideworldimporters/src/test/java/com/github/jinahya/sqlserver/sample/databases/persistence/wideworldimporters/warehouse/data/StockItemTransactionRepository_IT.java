package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockItemTransaction;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StockItemTransactionRepository}.
 */
@AddBeanClasses(StockItemTransactionRepository_.class)
class StockItemTransactionRepository_IT
        extends _Repository_IT<StockItemTransactionRepository, StockItemTransaction, Integer> {

    StockItemTransactionRepository_IT() {
        super(StockItemTransactionRepository.class, StockItemTransaction.class, Integer.class);
    }
}
