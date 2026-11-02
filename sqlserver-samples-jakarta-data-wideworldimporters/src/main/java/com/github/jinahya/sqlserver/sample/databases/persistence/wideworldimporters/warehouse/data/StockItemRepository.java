package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockItem;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StockItem}.
 */
@Repository
public interface StockItemRepository
        extends _Repository<StockItem, Integer>,
                CrudRepository<StockItem, Integer> {

}
