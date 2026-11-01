package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.Currency;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CurrencyRepository}.
 */
@AddBeanClasses(CurrencyRepository_.class)
class CurrencyRepository_IT
        extends _Repository_IT<CurrencyRepository, Currency, String> {

    CurrencyRepository_IT() {
        super(CurrencyRepository.class, Currency.class, String.class);
    }
}
