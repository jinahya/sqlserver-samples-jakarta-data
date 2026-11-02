package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.Product;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductRepository}.
 */
@AddBeanClasses(ProductRepository_.class)
class ProductRepository_IT
        extends _Repository_IT<ProductRepository, Product, Integer> {

    ProductRepository_IT() {
        super(ProductRepository.class, Product.class, Integer.class);
    }
}
