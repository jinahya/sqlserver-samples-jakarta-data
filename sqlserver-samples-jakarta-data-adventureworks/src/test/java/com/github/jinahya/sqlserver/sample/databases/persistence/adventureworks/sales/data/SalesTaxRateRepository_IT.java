package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesTaxRate;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesTaxRateRepository}.
 */
@AddBeanClasses(SalesTaxRateRepository_.class)
class SalesTaxRateRepository_IT
        extends _Repository_IT<SalesTaxRateRepository, SalesTaxRate, Integer> {

    SalesTaxRateRepository_IT() {
        super(SalesTaxRateRepository.class, SalesTaxRate.class, Integer.class);
    }
}
