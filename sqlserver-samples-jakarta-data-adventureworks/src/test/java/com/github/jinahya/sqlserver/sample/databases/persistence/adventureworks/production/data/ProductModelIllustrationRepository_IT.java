package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedProductModelIllustrationId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductModelIllustration;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductModelIllustrationRepository}.
 */
@AddBeanClasses(ProductModelIllustrationRepository_.class)
class ProductModelIllustrationRepository_IT
        extends _Repository_IT<ProductModelIllustrationRepository, ProductModelIllustration, MappedProductModelIllustrationId> {

    ProductModelIllustrationRepository_IT() {
        super(ProductModelIllustrationRepository.class, ProductModelIllustration.class, MappedProductModelIllustrationId.class);
    }
}
