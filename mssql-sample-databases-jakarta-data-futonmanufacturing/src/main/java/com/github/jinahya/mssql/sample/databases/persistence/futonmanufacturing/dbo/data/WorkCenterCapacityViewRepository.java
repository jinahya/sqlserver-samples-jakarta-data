package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.WorkCenterCapacityView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link WorkCenterCapacityView}.
 */
@Repository
public interface WorkCenterCapacityViewRepository
        extends _Repository<WorkCenterCapacityView, String>,
                CrudRepository<WorkCenterCapacityView, String> {

}
