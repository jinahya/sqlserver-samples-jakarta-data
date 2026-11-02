package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderHeader;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesOrderHeader}.
 */
@Repository
public interface SalesOrderHeaderRepository
        extends _Repository<SalesOrderHeader, Integer>,
                CrudRepository<SalesOrderHeader, Integer> {

}
