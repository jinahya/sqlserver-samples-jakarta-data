package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPersonSalesByFiscalYearsView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesPersonSalesByFiscalYearsViewRepository}.
 */
@AddBeanClasses(SalesPersonSalesByFiscalYearsViewRepository_.class)
class SalesPersonSalesByFiscalYearsViewRepository_IT
        extends _Repository_IT<SalesPersonSalesByFiscalYearsViewRepository, SalesPersonSalesByFiscalYearsView, Integer> {

    SalesPersonSalesByFiscalYearsViewRepository_IT() {
        super(SalesPersonSalesByFiscalYearsViewRepository.class, SalesPersonSalesByFiscalYearsView.class, Integer.class);
    }
}
