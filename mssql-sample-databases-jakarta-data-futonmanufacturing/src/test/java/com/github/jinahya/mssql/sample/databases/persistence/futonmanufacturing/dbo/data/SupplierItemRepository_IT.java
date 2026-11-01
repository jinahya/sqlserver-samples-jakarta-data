package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SupplierItem;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SupplierItemRepository}.
 */
@AddBeanClasses(SupplierItemRepository_.class)
class SupplierItemRepository_IT
        extends _Repository_IT<SupplierItemRepository, SupplierItem, Integer> {

    SupplierItemRepository_IT() {
        super(SupplierItemRepository.class, SupplierItem.class, Integer.class);
    }
}
