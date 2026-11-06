package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.PersonCreditCardId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonCreditCard;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PersonCreditCard}.
 */
@Repository
public interface PersonCreditCardRepository
        extends _Repository<PersonCreditCard, PersonCreditCardId>,
                CrudRepository<PersonCreditCard, PersonCreditCardId> {

}
