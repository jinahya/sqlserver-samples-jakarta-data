package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelProductDescriptionCultureId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelProductDescriptionCulture;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductModelProductDescriptionCultureRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductModelProductDescriptionCultureRepository}.
 */
@AddBeanClasses(ProductModelProductDescriptionCultureRepository_.class)
class ProductModelProductDescriptionCultureRepository_IT
        extends _Repository_IT<ProductModelProductDescriptionCultureRepository, ProductModelProductDescriptionCulture, ProductModelProductDescriptionCultureId> {

    ProductModelProductDescriptionCultureRepository_IT() {
        super(ProductModelProductDescriptionCultureRepository.class, ProductModelProductDescriptionCulture.class, ProductModelProductDescriptionCultureId.class);
    }
}
