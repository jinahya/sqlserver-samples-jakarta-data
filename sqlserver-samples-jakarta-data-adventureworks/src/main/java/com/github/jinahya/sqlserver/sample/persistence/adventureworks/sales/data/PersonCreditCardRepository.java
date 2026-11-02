package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.MappedPersonCreditCardId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonCreditCard;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PersonCreditCard}.
 */
@Repository
public interface PersonCreditCardRepository
        extends _Repository<PersonCreditCard, MappedPersonCreditCardId>,
                CrudRepository<PersonCreditCard, MappedPersonCreditCardId> {

}
