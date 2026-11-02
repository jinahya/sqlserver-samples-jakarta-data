package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CurrencyRate;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CurrencyRate}.
 */
@Repository
public interface CurrencyRateRepository
        extends _Repository<CurrencyRate, Integer>,
                CrudRepository<CurrencyRate, Integer> {

}
