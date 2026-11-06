package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductInventoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductInventory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductInventory}.
 */
@Repository
public interface ProductInventoryRepository
        extends _Repository<ProductInventory, ProductInventoryId>,
                CrudRepository<ProductInventory, ProductInventoryId> {

}
