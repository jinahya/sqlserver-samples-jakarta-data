package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SupplierItem;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SupplierItemRepository;
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
