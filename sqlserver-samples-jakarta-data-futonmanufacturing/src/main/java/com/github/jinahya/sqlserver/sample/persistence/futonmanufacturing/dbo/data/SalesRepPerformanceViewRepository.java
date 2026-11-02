package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesRepPerformanceView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesRepPerformanceView}.
 */
@Repository
public interface SalesRepPerformanceViewRepository
        extends _Repository<SalesRepPerformanceView, String>,
                CrudRepository<SalesRepPerformanceView, String> {

}
