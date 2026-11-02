package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ProductionCompletion;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductionCompletion}.
 */
@Repository
public interface ProductionCompletionRepository
        extends _Repository<ProductionCompletion, Integer>,
                CrudRepository<ProductionCompletion, Integer> {

}
