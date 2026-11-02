package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.Color;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Color}.
 */
@Repository
public interface ColorRepository
        extends _Repository<Color, Integer>,
                CrudRepository<Color, Integer> {

}
