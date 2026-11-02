package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.Person;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.PersonRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PersonRepository}.
 */
@AddBeanClasses(PersonRepository_.class)
class PersonRepository_IT
        extends _Repository_IT<PersonRepository, Person, Integer> {

    PersonRepository_IT() {
        super(PersonRepository.class, Person.class, Integer.class);
    }
}
