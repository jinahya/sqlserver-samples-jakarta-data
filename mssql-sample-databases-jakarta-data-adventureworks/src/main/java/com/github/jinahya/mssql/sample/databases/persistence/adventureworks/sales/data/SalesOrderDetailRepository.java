package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesOrderDetailId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesOrderDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesOrderDetail}.
 */
@Repository
public interface SalesOrderDetailRepository
        extends _Repository<SalesOrderDetail, MappedSalesOrderDetailId>,
                CrudRepository<SalesOrderDetail, MappedSalesOrderDetailId> {

}
