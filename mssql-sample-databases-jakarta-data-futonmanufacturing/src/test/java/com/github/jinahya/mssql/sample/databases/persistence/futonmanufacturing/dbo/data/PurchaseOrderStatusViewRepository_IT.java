package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrderStatusView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PurchaseOrderStatusViewRepository}.
 */
@AddBeanClasses(PurchaseOrderStatusViewRepository_.class)
class PurchaseOrderStatusViewRepository_IT
        extends _Repository_IT<PurchaseOrderStatusViewRepository, PurchaseOrderStatusView, String> {

    PurchaseOrderStatusViewRepository_IT() {
        super(PurchaseOrderStatusViewRepository.class, PurchaseOrderStatusView.class, String.class);
    }
}
