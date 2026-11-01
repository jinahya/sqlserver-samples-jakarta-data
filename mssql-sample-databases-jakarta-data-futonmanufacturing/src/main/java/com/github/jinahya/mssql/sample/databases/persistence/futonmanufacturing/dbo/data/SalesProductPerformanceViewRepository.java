package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesProductPerformanceView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesProductPerformanceView}.
 */
@Repository
public interface SalesProductPerformanceViewRepository
        extends _Repository<SalesProductPerformanceView, String>,
                CrudRepository<SalesProductPerformanceView, String> {

}
