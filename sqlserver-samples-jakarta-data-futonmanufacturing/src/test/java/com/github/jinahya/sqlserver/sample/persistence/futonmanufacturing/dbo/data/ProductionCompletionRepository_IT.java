package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.ProductionCompletion;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.ProductionCompletionRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductionCompletionRepository}.
 */
@AddBeanClasses(ProductionCompletionRepository_.class)
class ProductionCompletionRepository_IT
        extends _Repository_IT<ProductionCompletionRepository, ProductionCompletion, Integer> {

    ProductionCompletionRepository_IT() {
        super(ProductionCompletionRepository.class, ProductionCompletion.class, Integer.class);
    }
}
