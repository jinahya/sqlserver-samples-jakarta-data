package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.InventoryTransaction;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link InventoryTransaction}.
 */
@Repository
public interface InventoryTransactionRepository
        extends _Repository<InventoryTransaction, Integer>,
                CrudRepository<InventoryTransaction, Integer> {

}
