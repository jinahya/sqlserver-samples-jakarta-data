package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.Currency;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Currency}.
 */
@Repository
public interface CurrencyRepository
        extends _Repository<Currency, String>,
                CrudRepository<Currency, String> {

}
