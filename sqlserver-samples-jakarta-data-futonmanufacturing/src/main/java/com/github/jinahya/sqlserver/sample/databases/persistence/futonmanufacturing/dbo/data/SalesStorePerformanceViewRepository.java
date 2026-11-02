package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesStorePerformanceView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesStorePerformanceView}.
 */
@Repository
public interface SalesStorePerformanceViewRepository
        extends _Repository<SalesStorePerformanceView, String>,
                CrudRepository<SalesStorePerformanceView, String> {

}
