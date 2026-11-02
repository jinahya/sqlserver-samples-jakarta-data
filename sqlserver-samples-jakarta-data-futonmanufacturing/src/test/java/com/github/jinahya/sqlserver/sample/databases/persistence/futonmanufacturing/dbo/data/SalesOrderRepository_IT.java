package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesOrder;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderRepository}.
 */
@AddBeanClasses(SalesOrderRepository_.class)
class SalesOrderRepository_IT
        extends _Repository_IT<SalesOrderRepository, SalesOrder, Integer> {

    SalesOrderRepository_IT() {
        super(SalesOrderRepository.class, SalesOrder.class, Integer.class);
    }
}
