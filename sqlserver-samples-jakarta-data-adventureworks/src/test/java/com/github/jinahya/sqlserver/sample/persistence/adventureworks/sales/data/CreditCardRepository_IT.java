package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.CreditCard;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.CreditCardRepository;
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
