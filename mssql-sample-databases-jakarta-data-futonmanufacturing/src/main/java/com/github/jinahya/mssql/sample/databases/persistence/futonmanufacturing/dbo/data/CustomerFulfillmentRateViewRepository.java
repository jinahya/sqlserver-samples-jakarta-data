package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.CustomerFulfillmentRateView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CustomerFulfillmentRateView}.
 */
@Repository
public interface CustomerFulfillmentRateViewRepository
        extends _Repository<CustomerFulfillmentRateView, String>,
                CrudRepository<CustomerFulfillmentRateView, String> {

}
