package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockItemTransaction;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StockItemTransaction}.
 */
@Repository
public interface StockItemTransactionRepository
        extends _Repository<StockItemTransaction, Integer>,
                CrudRepository<StockItemTransaction, Integer> {

}
