package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.PurchaseOrder;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data.PurchaseOrderRepository;
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
