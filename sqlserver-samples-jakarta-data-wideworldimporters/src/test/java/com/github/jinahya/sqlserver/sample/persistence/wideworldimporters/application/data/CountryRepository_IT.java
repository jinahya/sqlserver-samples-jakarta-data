package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.Country;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data.CountryRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CountryRepository}.
 */
@AddBeanClasses(CountryRepository_.class)
class CountryRepository_IT
        extends _Repository_IT<CountryRepository, Country, Integer> {

    CountryRepository_IT() {
        super(CountryRepository.class, Country.class, Integer.class);
    }
}
