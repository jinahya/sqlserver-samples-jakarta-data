package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.purchasing.MappedPurchaseOrderDetailId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.PurchaseOrderDetail;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data.PurchaseOrderDetailRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PurchaseOrderDetailRepository}.
 */
@AddBeanClasses(PurchaseOrderDetailRepository_.class)
class PurchaseOrderDetailRepository_IT
        extends _Repository_IT<PurchaseOrderDetailRepository, PurchaseOrderDetail, MappedPurchaseOrderDetailId> {

    PurchaseOrderDetailRepository_IT() {
        super(PurchaseOrderDetailRepository.class, PurchaseOrderDetail.class, MappedPurchaseOrderDetailId.class);
    }
}
