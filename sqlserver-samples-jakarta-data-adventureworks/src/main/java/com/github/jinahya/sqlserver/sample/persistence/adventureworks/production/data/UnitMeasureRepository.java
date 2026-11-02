package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.UnitMeasure;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link UnitMeasure}.
 */
@Repository
public interface UnitMeasureRepository
        extends _Repository<UnitMeasure, String>,
                CrudRepository<UnitMeasure, String> {

}
