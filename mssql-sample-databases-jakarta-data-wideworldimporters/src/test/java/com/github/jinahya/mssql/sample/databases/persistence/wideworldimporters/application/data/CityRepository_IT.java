package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.City;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
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
