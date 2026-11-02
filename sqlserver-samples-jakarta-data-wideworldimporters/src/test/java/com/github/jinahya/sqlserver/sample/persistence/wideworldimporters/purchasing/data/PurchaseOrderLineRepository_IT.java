package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.PurchaseOrderLine;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data.PurchaseOrderLineRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PurchaseOrderLineRepository}.
 */
@AddBeanClasses(PurchaseOrderLineRepository_.class)
class PurchaseOrderLineRepository_IT
        extends _Repository_IT<PurchaseOrderLineRepository, PurchaseOrderLine, Integer> {

    PurchaseOrderLineRepository_IT() {
        super(PurchaseOrderLineRepository.class, PurchaseOrderLine.class, Integer.class);
    }
}
