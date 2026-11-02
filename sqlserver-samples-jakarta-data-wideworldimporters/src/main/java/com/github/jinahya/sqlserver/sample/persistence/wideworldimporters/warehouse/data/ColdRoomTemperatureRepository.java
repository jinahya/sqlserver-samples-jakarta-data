package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.ColdRoomTemperature;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ColdRoomTemperature}.
 */
@Repository
public interface ColdRoomTemperatureRepository
        extends _Repository<ColdRoomTemperature, Long>,
                CrudRepository<ColdRoomTemperature, Long> {

}
