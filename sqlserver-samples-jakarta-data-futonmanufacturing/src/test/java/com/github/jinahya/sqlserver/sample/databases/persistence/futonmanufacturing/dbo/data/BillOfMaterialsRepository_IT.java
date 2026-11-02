package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.BillOfMaterials;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link BillOfMaterialsRepository}.
 */
@AddBeanClasses(BillOfMaterialsRepository_.class)
class BillOfMaterialsRepository_IT
        extends _Repository_IT<BillOfMaterialsRepository, BillOfMaterials, Integer> {

    BillOfMaterialsRepository_IT() {
        super(BillOfMaterialsRepository.class, BillOfMaterials.class, Integer.class);
    }
}
