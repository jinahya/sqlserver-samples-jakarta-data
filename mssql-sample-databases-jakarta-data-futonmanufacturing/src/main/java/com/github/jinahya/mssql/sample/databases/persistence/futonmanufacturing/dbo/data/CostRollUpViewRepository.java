package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.CostRollUpView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CostRollUpView}.
 */
@Repository
public interface CostRollUpViewRepository
        extends _Repository<CostRollUpView, String>,
                CrudRepository<CostRollUpView, String> {

}
