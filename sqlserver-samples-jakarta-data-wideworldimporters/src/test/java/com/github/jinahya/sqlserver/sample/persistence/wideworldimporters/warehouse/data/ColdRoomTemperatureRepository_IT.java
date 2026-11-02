package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.ColdRoomTemperature;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.warehouse.data.ColdRoomTemperatureRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ColdRoomTemperatureRepository}.
 */
@AddBeanClasses(ColdRoomTemperatureRepository_.class)
class ColdRoomTemperatureRepository_IT
        extends _Repository_IT<ColdRoomTemperatureRepository, ColdRoomTemperature, Long> {

    ColdRoomTemperatureRepository_IT() {
        super(ColdRoomTemperatureRepository.class, ColdRoomTemperature.class, Long.class);
    }
}
