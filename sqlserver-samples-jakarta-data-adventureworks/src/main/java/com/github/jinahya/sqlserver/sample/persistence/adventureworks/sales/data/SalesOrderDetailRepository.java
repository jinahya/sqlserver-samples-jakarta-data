package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesOrderDetailId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesOrderDetail}.
 */
@Repository
public interface SalesOrderDetailRepository
        extends _Repository<SalesOrderDetail, SalesOrderDetailId>,
                CrudRepository<SalesOrderDetail, SalesOrderDetailId> {

}
