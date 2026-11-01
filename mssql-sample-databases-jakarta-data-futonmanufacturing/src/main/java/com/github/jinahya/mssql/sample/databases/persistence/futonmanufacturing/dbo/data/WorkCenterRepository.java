package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.WorkCenter;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link WorkCenter}.
 */
@Repository
public interface WorkCenterRepository
        extends _Repository<WorkCenter, Integer>,
                CrudRepository<WorkCenter, Integer> {

}
