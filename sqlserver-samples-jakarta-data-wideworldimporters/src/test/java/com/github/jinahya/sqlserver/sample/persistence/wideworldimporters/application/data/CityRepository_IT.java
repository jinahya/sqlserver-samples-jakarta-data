package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.City;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data.CityRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CityRepository}.
 */
@AddBeanClasses(CityRepository_.class)
class CityRepository_IT
        extends _Repository_IT<CityRepository, City, Integer> {

    CityRepository_IT() {
        super(CityRepository.class, City.class, Integer.class);
    }
}
