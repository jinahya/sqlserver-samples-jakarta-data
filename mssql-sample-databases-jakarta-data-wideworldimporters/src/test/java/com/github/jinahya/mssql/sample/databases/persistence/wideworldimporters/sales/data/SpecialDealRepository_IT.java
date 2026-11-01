package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.SpecialDeal;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SpecialDealRepository}.
 */
@AddBeanClasses(SpecialDealRepository_.class)
class SpecialDealRepository_IT
        extends _Repository_IT<SpecialDealRepository, SpecialDeal, Integer> {

    SpecialDealRepository_IT() {
        super(SpecialDealRepository.class, SpecialDeal.class, Integer.class);
    }
}
