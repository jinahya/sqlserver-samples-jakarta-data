package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.MappedEmailAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.EmailAddress;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link EmailAddress}.
 */
@Repository
public interface EmailAddressRepository
        extends _Repository<EmailAddress, MappedEmailAddressId>,
                CrudRepository<EmailAddress, MappedEmailAddressId> {

}
