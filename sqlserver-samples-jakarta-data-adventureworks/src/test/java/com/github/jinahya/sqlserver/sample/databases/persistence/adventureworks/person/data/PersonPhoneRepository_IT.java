package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.person.MappedPersonPhoneId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.PersonPhone;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PersonPhoneRepository}.
 */
@AddBeanClasses(PersonPhoneRepository_.class)
class PersonPhoneRepository_IT
        extends _Repository_IT<PersonPhoneRepository, PersonPhone, MappedPersonPhoneId> {

    PersonPhoneRepository_IT() {
        super(PersonPhoneRepository.class, PersonPhone.class, MappedPersonPhoneId.class);
    }
}
