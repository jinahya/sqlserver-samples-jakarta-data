package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerAnalysisView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesCustomerAnalysisView}.
 */
@Repository
public interface SalesCustomerAnalysisViewRepository
        extends _Repository<SalesCustomerAnalysisView, Integer>,
                CrudRepository<SalesCustomerAnalysisView, Integer> {

}
