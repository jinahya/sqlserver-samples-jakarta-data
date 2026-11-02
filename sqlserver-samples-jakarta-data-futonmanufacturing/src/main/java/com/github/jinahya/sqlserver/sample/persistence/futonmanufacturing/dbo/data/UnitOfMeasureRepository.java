package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.UnitOfMeasure;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link UnitOfMeasure}.
 */
@Repository
public interface UnitOfMeasureRepository
        extends _Repository<UnitOfMeasure, Integer>,
                CrudRepository<UnitOfMeasure, Integer> {

}
