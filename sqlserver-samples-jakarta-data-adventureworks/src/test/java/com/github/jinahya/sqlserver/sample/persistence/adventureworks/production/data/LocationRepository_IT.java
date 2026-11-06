package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Location;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.LocationRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link LocationRepository}.
 */
@AddBeanClasses(LocationRepository_.class)
class LocationRepository_IT
        extends _Repository_IT<LocationRepository, Location, Long> {

    LocationRepository_IT() {
        super(LocationRepository.class, Location.class, Long.class);
    }
}
