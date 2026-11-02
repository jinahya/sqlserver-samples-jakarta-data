package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrderDetail;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PurchaseOrderDetailRepository}.
 */
@AddBeanClasses(PurchaseOrderDetailRepository_.class)
class PurchaseOrderDetailRepository_IT
        extends _Repository_IT<PurchaseOrderDetailRepository, PurchaseOrderDetail, Integer> {

    PurchaseOrderDetailRepository_IT() {
        super(PurchaseOrderDetailRepository.class, PurchaseOrderDetail.class, Integer.class);
    }
}
