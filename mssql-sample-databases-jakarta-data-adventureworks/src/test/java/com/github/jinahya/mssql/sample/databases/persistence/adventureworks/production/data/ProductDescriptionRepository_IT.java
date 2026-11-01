package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductDescription;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductDescriptionRepository}.
 */
@AddBeanClasses(ProductDescriptionRepository_.class)
class ProductDescriptionRepository_IT
        extends _Repository_IT<ProductDescriptionRepository, ProductDescription, Integer> {

    ProductDescriptionRepository_IT() {
        super(ProductDescriptionRepository.class, ProductDescription.class, Integer.class);
    }
}
