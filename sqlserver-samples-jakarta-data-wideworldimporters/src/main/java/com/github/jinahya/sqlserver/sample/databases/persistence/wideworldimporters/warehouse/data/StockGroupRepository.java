package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockGroup;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StockGroup}.
 */
@Repository
public interface StockGroupRepository
        extends _Repository<StockGroup, Integer>,
                CrudRepository<StockGroup, Integer> {

}
