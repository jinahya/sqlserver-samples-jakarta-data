package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.ContactType;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ContactTypeRepository}.
 */
@AddBeanClasses(ContactTypeRepository_.class)
class ContactTypeRepository_IT
        extends _Repository_IT<ContactTypeRepository, ContactType, Integer> {

    ContactTypeRepository_IT() {
        super(ContactTypeRepository.class, ContactType.class, Integer.class);
    }
}
