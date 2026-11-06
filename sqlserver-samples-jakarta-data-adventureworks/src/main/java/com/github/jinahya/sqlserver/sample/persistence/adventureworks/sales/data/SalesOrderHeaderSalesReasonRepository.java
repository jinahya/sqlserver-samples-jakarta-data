package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesOrderHeaderSalesReasonId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderHeaderSalesReason;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesOrderHeaderSalesReason}.
 */
@Repository
public interface SalesOrderHeaderSalesReasonRepository
        extends _Repository<SalesOrderHeaderSalesReason, SalesOrderHeaderSalesReasonId>,
                CrudRepository<SalesOrderHeaderSalesReason, SalesOrderHeaderSalesReasonId> {

}
