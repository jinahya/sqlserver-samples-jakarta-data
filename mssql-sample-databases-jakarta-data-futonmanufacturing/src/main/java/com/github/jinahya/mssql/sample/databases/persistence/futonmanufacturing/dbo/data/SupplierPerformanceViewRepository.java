package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SupplierPerformanceView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SupplierPerformanceView}.
 */
@Repository
public interface SupplierPerformanceViewRepository
        extends _Repository<SupplierPerformanceView, String>,
                CrudRepository<SupplierPerformanceView, String> {

}
