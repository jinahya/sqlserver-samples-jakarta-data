package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockItemStockGroup;
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
