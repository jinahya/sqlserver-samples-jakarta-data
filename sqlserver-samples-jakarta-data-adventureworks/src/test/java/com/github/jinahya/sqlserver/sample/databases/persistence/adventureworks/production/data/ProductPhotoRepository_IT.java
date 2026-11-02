package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductPhoto;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductPhotoRepository}.
 */
@AddBeanClasses(ProductPhotoRepository_.class)
class ProductPhotoRepository_IT
        extends _Repository_IT<ProductPhotoRepository, ProductPhoto, Integer> {

    ProductPhotoRepository_IT() {
        super(ProductPhotoRepository.class, ProductPhoto.class, Integer.class);
    }
}
