package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ProductionOrder;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductionOrderRepository}.
 */
@AddBeanClasses(ProductionOrderRepository_.class)
class ProductionOrderRepository_IT
        extends _Repository_IT<ProductionOrderRepository, ProductionOrder, Integer> {

    ProductionOrderRepository_IT() {
        super(ProductionOrderRepository.class, ProductionOrder.class, Integer.class);
    }
}
