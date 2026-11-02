package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.InventoryValuationView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link InventoryValuationView}.
 */
@Repository
public interface InventoryValuationViewRepository
        extends _Repository<InventoryValuationView, String>,
                CrudRepository<InventoryValuationView, String> {

}
