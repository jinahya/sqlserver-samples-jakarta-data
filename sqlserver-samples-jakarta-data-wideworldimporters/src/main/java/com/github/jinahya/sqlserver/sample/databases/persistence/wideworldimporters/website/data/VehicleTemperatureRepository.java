package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.website.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.website.VehicleTemperature;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link VehicleTemperature}.
 */
@Repository
public interface VehicleTemperatureRepository
        extends _Repository<VehicleTemperature, Long>,
                CrudRepository<VehicleTemperature, Long> {

}
