package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.StockItemHolding;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StockItemHolding}.
 */
@Repository
public interface StockItemHoldingRepository
        extends _Repository<StockItemHolding, Integer>,
                CrudRepository<StockItemHolding, Integer> {

}
