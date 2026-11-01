package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.CreditCard;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CreditCardRepository}.
 */
@AddBeanClasses(CreditCardRepository_.class)
class CreditCardRepository_IT
        extends _Repository_IT<CreditCardRepository, CreditCard, Integer> {

    CreditCardRepository_IT() {
        super(CreditCardRepository.class, CreditCard.class, Integer.class);
    }
}
