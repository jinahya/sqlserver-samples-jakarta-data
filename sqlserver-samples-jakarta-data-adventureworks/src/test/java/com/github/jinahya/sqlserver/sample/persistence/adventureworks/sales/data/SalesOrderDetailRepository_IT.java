package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesOrderDetailId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderDetail;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesOrderDetailRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderDetailRepository}.
 */
@AddBeanClasses(SalesOrderDetailRepository_.class)
class SalesOrderDetailRepository_IT
        extends _Repository_IT<SalesOrderDetailRepository, SalesOrderDetail, SalesOrderDetailId> {

    SalesOrderDetailRepository_IT() {
        super(SalesOrderDetailRepository.class, SalesOrderDetail.class, SalesOrderDetailId.class);
    }
}
