package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductSubcategory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductSubcategoryRepository}.
 */
@AddBeanClasses(ProductSubcategoryRepository_.class)
class ProductSubcategoryRepository_IT
        extends _Repository_IT<ProductSubcategoryRepository, ProductSubcategory, Integer> {

    ProductSubcategoryRepository_IT() {
        super(ProductSubcategoryRepository.class, ProductSubcategory.class, Integer.class);
    }
}
