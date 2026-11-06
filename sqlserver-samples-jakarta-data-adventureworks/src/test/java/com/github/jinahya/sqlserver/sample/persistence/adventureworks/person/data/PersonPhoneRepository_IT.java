package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.PersonPhoneId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.PersonPhone;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.PersonPhoneRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PersonPhoneRepository}.
 */
@AddBeanClasses(PersonPhoneRepository_.class)
class PersonPhoneRepository_IT
        extends _Repository_IT<PersonPhoneRepository, PersonPhone, PersonPhoneId> {

    PersonPhoneRepository_IT() {
        super(PersonPhoneRepository.class, PersonPhone.class, PersonPhoneId.class);
    }
}
