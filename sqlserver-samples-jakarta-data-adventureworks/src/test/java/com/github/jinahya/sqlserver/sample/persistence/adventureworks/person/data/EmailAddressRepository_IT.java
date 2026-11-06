package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.EmailAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.EmailAddress;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.EmailAddressRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link EmailAddressRepository}.
 */
@AddBeanClasses(EmailAddressRepository_.class)
class EmailAddressRepository_IT
        extends _Repository_IT<EmailAddressRepository, EmailAddress, EmailAddressId> {

    EmailAddressRepository_IT() {
        super(EmailAddressRepository.class, EmailAddress.class, EmailAddressId.class);
    }
}
