package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductProductPhotoId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductProductPhoto;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductProductPhotoRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductProductPhotoRepository}.
 */
@AddBeanClasses(ProductProductPhotoRepository_.class)
class ProductProductPhotoRepository_IT
        extends _Repository_IT<ProductProductPhotoRepository, ProductProductPhoto, ProductProductPhotoId> {

    ProductProductPhotoRepository_IT() {
        super(ProductProductPhotoRepository.class, ProductProductPhoto.class, ProductProductPhotoId.class);
    }
}
