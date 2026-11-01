package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.Person;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
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
