package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.InventoryTurnoverView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link InventoryTurnoverView}.
 */
@Repository
public interface InventoryTurnoverViewRepository
        extends _Repository<InventoryTurnoverView, String>,
                CrudRepository<InventoryTurnoverView, String> {

}
