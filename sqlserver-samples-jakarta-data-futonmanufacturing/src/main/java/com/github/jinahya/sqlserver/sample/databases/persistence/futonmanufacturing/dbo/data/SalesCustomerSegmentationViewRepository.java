package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesCustomerSegmentationView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesCustomerSegmentationView}.
 */
@Repository
public interface SalesCustomerSegmentationViewRepository
        extends _Repository<SalesCustomerSegmentationView, Integer>,
                CrudRepository<SalesCustomerSegmentationView, Integer> {

}
