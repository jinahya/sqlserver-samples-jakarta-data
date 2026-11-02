package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.StockItemStockGroup;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StockItemStockGroup}.
 */
@Repository
public interface StockItemStockGroupRepository
        extends _Repository<StockItemStockGroup, Integer>,
                CrudRepository<StockItemStockGroup, Integer> {

}
