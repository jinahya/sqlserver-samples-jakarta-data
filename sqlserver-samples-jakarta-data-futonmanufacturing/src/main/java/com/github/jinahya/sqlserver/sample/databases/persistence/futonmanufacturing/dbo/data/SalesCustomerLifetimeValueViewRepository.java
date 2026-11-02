package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerLifetimeValueView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesCustomerLifetimeValueView}.
 */
@Repository
public interface SalesCustomerLifetimeValueViewRepository
        extends _Repository<SalesCustomerLifetimeValueView, Integer>,
                CrudRepository<SalesCustomerLifetimeValueView, Integer> {

}
