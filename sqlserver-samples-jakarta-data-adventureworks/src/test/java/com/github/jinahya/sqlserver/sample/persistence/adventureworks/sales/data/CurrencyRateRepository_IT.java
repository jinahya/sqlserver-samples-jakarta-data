package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CurrencyRate;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.CurrencyRateRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CurrencyRateRepository}.
 */
@AddBeanClasses(CurrencyRateRepository_.class)
class CurrencyRateRepository_IT
        extends _Repository_IT<CurrencyRateRepository, CurrencyRate, Integer> {

    CurrencyRateRepository_IT() {
        super(CurrencyRateRepository.class, CurrencyRate.class, Integer.class);
    }
}
