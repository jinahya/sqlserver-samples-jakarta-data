package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.MappedSalesTerritoryHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesTerritoryHistory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesTerritoryHistory}.
 */
@Repository
public interface SalesTerritoryHistoryRepository
        extends _Repository<SalesTerritoryHistory, MappedSalesTerritoryHistoryId>,
                CrudRepository<SalesTerritoryHistory, MappedSalesTerritoryHistoryId> {

}
