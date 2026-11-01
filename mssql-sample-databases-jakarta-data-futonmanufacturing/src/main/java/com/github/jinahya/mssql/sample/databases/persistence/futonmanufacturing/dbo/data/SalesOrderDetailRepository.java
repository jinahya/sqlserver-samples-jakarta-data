package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesOrderDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesOrderDetail}.
 */
@Repository
public interface SalesOrderDetailRepository
        extends _Repository<SalesOrderDetail, Integer>,
                CrudRepository<SalesOrderDetail, Integer> {

}
