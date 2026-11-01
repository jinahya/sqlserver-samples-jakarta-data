package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.person.MappedEmailAddressId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.EmailAddress;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmailAddressRepository}.
 */
@AddBeanClasses(EmailAddressRepository_.class)
class EmailAddressRepository_IT
        extends _Repository_IT<EmailAddressRepository, EmailAddress, MappedEmailAddressId> {

    EmailAddressRepository_IT() {
        super(EmailAddressRepository.class, EmailAddress.class, MappedEmailAddressId.class);
    }
}
