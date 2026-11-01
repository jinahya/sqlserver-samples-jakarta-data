package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.PurchaseOrderHeader;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PurchaseOrderHeaderRepository}.
 */
@AddBeanClasses(PurchaseOrderHeaderRepository_.class)
class PurchaseOrderHeaderRepository_IT
        extends _Repository_IT<PurchaseOrderHeaderRepository, PurchaseOrderHeader, Integer> {

    PurchaseOrderHeaderRepository_IT() {
        super(PurchaseOrderHeaderRepository.class, PurchaseOrderHeader.class, Integer.class);
    }
}
