package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductCategory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductCategoryRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductCategoryRepository}.
 */
@AddBeanClasses(ProductCategoryRepository_.class)
class ProductCategoryRepository_IT
        extends _Repository_IT<ProductCategoryRepository, ProductCategory, Integer> {

    ProductCategoryRepository_IT() {
        super(ProductCategoryRepository.class, ProductCategory.class, Integer.class);
    }
}
