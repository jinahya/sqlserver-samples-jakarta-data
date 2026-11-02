package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.MappedProductInventoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductInventory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductInventoryRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductInventoryRepository}.
 */
@AddBeanClasses(ProductInventoryRepository_.class)
class ProductInventoryRepository_IT
        extends _Repository_IT<ProductInventoryRepository, ProductInventory, MappedProductInventoryId> {

    ProductInventoryRepository_IT() {
        super(ProductInventoryRepository.class, ProductInventory.class, MappedProductInventoryId.class);
    }
}
