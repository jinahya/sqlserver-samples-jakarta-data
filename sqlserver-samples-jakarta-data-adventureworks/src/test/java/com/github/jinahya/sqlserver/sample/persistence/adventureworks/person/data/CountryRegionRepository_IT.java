package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.CountryRegion;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.CountryRegionRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CountryRegionRepository}.
 */
@AddBeanClasses(CountryRegionRepository_.class)
class CountryRegionRepository_IT
        extends _Repository_IT<CountryRegionRepository, CountryRegion, String> {

    CountryRegionRepository_IT() {
        super(CountryRegionRepository.class, CountryRegion.class, String.class);
    }
}
