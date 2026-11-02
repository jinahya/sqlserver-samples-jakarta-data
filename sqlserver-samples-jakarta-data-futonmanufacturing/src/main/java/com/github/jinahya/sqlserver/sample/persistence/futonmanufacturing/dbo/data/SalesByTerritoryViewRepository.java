package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesByTerritoryView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesByTerritoryView}.
 */
@Repository
public interface SalesByTerritoryViewRepository
        extends _Repository<SalesByTerritoryView, String>,
                CrudRepository<SalesByTerritoryView, String> {

}
