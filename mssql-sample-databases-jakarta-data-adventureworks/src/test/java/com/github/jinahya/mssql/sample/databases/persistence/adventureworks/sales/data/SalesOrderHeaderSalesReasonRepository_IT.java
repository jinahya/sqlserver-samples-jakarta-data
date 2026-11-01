package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesOrderHeaderSalesReasonId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesOrderHeaderSalesReason;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderHeaderSalesReasonRepository}.
 */
@AddBeanClasses(SalesOrderHeaderSalesReasonRepository_.class)
class SalesOrderHeaderSalesReasonRepository_IT
        extends _Repository_IT<SalesOrderHeaderSalesReasonRepository, SalesOrderHeaderSalesReason, MappedSalesOrderHeaderSalesReasonId> {

    SalesOrderHeaderSalesReasonRepository_IT() {
        super(SalesOrderHeaderSalesReasonRepository.class, SalesOrderHeaderSalesReason.class, MappedSalesOrderHeaderSalesReasonId.class);
    }
}
