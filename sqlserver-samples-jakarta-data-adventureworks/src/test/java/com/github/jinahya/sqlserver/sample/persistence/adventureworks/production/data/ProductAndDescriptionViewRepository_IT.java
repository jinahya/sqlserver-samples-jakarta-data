package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.MappedProductAndDescriptionViewId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductAndDescriptionView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductAndDescriptionViewRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductAndDescriptionViewRepository}.
 */
@AddBeanClasses(ProductAndDescriptionViewRepository_.class)
class ProductAndDescriptionViewRepository_IT
        extends _Repository_IT<ProductAndDescriptionViewRepository, ProductAndDescriptionView, MappedProductAndDescriptionViewId> {

    ProductAndDescriptionViewRepository_IT() {
        super(ProductAndDescriptionViewRepository.class, ProductAndDescriptionView.class, MappedProductAndDescriptionViewId.class);
    }
}
