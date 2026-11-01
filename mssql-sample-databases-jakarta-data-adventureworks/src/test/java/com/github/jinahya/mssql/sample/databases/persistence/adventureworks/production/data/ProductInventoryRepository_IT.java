package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductInventoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductInventory;
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
