package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesOrderDetailId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesOrderDetail;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderDetailRepository}.
 */
@AddBeanClasses(SalesOrderDetailRepository_.class)
class SalesOrderDetailRepository_IT
        extends _Repository_IT<SalesOrderDetailRepository, SalesOrderDetail, MappedSalesOrderDetailId> {

    SalesOrderDetailRepository_IT() {
        super(SalesOrderDetailRepository.class, SalesOrderDetail.class, MappedSalesOrderDetailId.class);
    }
}
