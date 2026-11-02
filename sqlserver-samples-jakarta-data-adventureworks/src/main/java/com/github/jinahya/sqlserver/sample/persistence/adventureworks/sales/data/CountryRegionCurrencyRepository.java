package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.MappedCountryRegionCurrencyId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CountryRegionCurrency;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CountryRegionCurrency}.
 */
@Repository
public interface CountryRegionCurrencyRepository
        extends _Repository<CountryRegionCurrency, MappedCountryRegionCurrencyId>,
                CrudRepository<CountryRegionCurrency, MappedCountryRegionCurrencyId> {

}
