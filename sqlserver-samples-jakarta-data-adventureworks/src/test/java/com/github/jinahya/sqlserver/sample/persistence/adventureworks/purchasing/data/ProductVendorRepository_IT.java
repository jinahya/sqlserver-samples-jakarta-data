package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.purchasing.ProductVendorId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.ProductVendor;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data.ProductVendorRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductVendorRepository}.
 */
@AddBeanClasses(ProductVendorRepository_.class)
class ProductVendorRepository_IT
        extends _Repository_IT<ProductVendorRepository, ProductVendor, ProductVendorId> {

    ProductVendorRepository_IT() {
        super(ProductVendorRepository.class, ProductVendor.class, ProductVendorId.class);
    }
}
