package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductInventoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductInventory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductInventory}.
 */
@Repository
public interface ProductInventoryRepository
        extends _Repository<ProductInventory, MappedProductInventoryId>,
                CrudRepository<ProductInventory, MappedProductInventoryId> {

}
