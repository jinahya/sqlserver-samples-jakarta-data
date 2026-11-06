package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesOrderHeaderSalesReasonId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderHeaderSalesReason;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesOrderHeaderSalesReasonRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderHeaderSalesReasonRepository}.
 */
@AddBeanClasses(SalesOrderHeaderSalesReasonRepository_.class)
class SalesOrderHeaderSalesReasonRepository_IT
        extends _Repository_IT<SalesOrderHeaderSalesReasonRepository, SalesOrderHeaderSalesReason, SalesOrderHeaderSalesReasonId> {

    SalesOrderHeaderSalesReasonRepository_IT() {
        super(SalesOrderHeaderSalesReasonRepository.class, SalesOrderHeaderSalesReason.class, SalesOrderHeaderSalesReasonId.class);
    }
}
