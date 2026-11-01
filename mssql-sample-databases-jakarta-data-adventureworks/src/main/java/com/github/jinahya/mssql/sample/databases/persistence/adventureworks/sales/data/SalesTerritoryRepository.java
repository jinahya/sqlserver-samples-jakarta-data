package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesTerritory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesTerritory}.
 */
@Repository
public interface SalesTerritoryRepository
        extends _Repository<SalesTerritory, Integer>,
                CrudRepository<SalesTerritory, Integer> {

}
