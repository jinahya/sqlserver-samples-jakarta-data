package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrder;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PurchaseOrderRepository}.
 */
@AddBeanClasses(PurchaseOrderRepository_.class)
class PurchaseOrderRepository_IT
        extends _Repository_IT<PurchaseOrderRepository, PurchaseOrder, Integer> {

    PurchaseOrderRepository_IT() {
        super(PurchaseOrderRepository.class, PurchaseOrder.class, Integer.class);
    }
}
