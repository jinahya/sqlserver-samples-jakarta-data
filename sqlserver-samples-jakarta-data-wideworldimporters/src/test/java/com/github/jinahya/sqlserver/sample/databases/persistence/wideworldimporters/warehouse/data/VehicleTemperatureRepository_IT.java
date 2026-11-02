package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.VehicleTemperature;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link VehicleTemperatureRepository}.
 */
@AddBeanClasses(VehicleTemperatureRepository_.class)
class VehicleTemperatureRepository_IT
        extends _Repository_IT<VehicleTemperatureRepository, VehicleTemperature, Long> {

    VehicleTemperatureRepository_IT() {
        super(VehicleTemperatureRepository.class, VehicleTemperature.class, Long.class);
    }
}
