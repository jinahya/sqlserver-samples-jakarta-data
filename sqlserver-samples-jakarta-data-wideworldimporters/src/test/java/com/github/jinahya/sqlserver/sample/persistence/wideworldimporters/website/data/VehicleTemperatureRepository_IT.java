package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.website.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.website.VehicleTemperature;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.website.data.VehicleTemperatureRepository;
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
