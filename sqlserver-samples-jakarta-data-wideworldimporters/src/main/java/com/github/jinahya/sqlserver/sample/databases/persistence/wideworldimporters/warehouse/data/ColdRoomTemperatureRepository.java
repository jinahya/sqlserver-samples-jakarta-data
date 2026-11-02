package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.ColdRoomTemperature;
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
