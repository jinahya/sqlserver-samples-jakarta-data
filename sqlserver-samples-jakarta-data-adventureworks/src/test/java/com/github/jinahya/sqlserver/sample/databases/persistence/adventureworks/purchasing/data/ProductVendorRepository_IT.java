package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.purchasing.MappedProductVendorId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.ProductVendor;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductVendorRepository}.
 */
@AddBeanClasses(ProductVendorRepository_.class)
class ProductVendorRepository_IT
        extends _Repository_IT<ProductVendorRepository, ProductVendor, MappedProductVendorId> {

    ProductVendorRepository_IT() {
        super(ProductVendorRepository.class, ProductVendor.class, MappedProductVendorId.class);
    }
}
