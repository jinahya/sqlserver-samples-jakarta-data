package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedCountryRegionCurrencyId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.CountryRegionCurrency;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CountryRegionCurrencyRepository}.
 */
@AddBeanClasses(CountryRegionCurrencyRepository_.class)
class CountryRegionCurrencyRepository_IT
        extends _Repository_IT<CountryRegionCurrencyRepository, CountryRegionCurrency, MappedCountryRegionCurrencyId> {

    CountryRegionCurrencyRepository_IT() {
        super(CountryRegionCurrencyRepository.class, CountryRegionCurrency.class, MappedCountryRegionCurrencyId.class);
    }
}
