package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductProductPhotoId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductProductPhoto;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductProductPhotoRepository}.
 */
@AddBeanClasses(ProductProductPhotoRepository_.class)
class ProductProductPhotoRepository_IT
        extends _Repository_IT<ProductProductPhotoRepository, ProductProductPhoto, MappedProductProductPhotoId> {

    ProductProductPhotoRepository_IT() {
        super(ProductProductPhotoRepository.class, ProductProductPhoto.class, MappedProductProductPhotoId.class);
    }
}
