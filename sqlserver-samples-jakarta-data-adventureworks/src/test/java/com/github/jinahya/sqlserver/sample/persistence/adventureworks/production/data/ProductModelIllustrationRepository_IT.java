package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelIllustrationId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelIllustration;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductModelIllustrationRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductModelIllustrationRepository}.
 */
@AddBeanClasses(ProductModelIllustrationRepository_.class)
class ProductModelIllustrationRepository_IT
        extends _Repository_IT<ProductModelIllustrationRepository, ProductModelIllustration, ProductModelIllustrationId> {

    ProductModelIllustrationRepository_IT() {
        super(ProductModelIllustrationRepository.class, ProductModelIllustration.class, ProductModelIllustrationId.class);
    }
}
