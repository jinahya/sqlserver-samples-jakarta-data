package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesTerritory;
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
