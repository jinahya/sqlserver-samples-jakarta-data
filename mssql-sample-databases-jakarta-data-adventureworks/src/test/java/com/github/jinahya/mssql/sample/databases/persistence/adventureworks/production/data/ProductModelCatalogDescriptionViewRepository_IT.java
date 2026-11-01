package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductModelCatalogDescriptionView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductModelCatalogDescriptionViewRepository}.
 */
@AddBeanClasses(ProductModelCatalogDescriptionViewRepository_.class)
class ProductModelCatalogDescriptionViewRepository_IT
        extends _Repository_IT<ProductModelCatalogDescriptionViewRepository, ProductModelCatalogDescriptionView, Integer> {

    ProductModelCatalogDescriptionViewRepository_IT() {
        super(ProductModelCatalogDescriptionViewRepository.class, ProductModelCatalogDescriptionView.class, Integer.class);
    }
}
