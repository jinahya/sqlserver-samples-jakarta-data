package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModel;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductModelRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductModelRepository}.
 */
@AddBeanClasses(ProductModelRepository_.class)
class ProductModelRepository_IT
        extends _Repository_IT<ProductModelRepository, ProductModel, Integer> {

    ProductModelRepository_IT() {
        super(ProductModelRepository.class, ProductModel.class, Integer.class);
    }
}
