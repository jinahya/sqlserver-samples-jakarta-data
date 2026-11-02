package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ProductionOrderMaterial;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductionOrderMaterialRepository}.
 */
@AddBeanClasses(ProductionOrderMaterialRepository_.class)
class ProductionOrderMaterialRepository_IT
        extends _Repository_IT<ProductionOrderMaterialRepository, ProductionOrderMaterial, Integer> {

    ProductionOrderMaterialRepository_IT() {
        super(ProductionOrderMaterialRepository.class, ProductionOrderMaterial.class, Integer.class);
    }
}
