package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.PersonCreditCardId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonCreditCard;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.PersonCreditCardRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PersonCreditCardRepository}.
 */
@AddBeanClasses(PersonCreditCardRepository_.class)
class PersonCreditCardRepository_IT
        extends _Repository_IT<PersonCreditCardRepository, PersonCreditCard, PersonCreditCardId> {

    PersonCreditCardRepository_IT() {
        super(PersonCreditCardRepository.class, PersonCreditCard.class, PersonCreditCardId.class);
    }
}
