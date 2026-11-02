package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedProductModelProductDescriptionCultureId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductModelProductDescriptionCulture;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductModelProductDescriptionCultureRepository}.
 */
@AddBeanClasses(ProductModelProductDescriptionCultureRepository_.class)
class ProductModelProductDescriptionCultureRepository_IT
        extends _Repository_IT<ProductModelProductDescriptionCultureRepository, ProductModelProductDescriptionCulture, MappedProductModelProductDescriptionCultureId> {

    ProductModelProductDescriptionCultureRepository_IT() {
        super(ProductModelProductDescriptionCultureRepository.class, ProductModelProductDescriptionCulture.class, MappedProductModelProductDescriptionCultureId.class);
    }
}
