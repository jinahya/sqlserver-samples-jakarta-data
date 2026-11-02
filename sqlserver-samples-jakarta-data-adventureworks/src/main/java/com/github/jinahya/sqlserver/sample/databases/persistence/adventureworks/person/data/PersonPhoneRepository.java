package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.person.MappedPersonPhoneId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.PersonPhone;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PersonPhone}.
 */
@Repository
public interface PersonPhoneRepository
        extends _Repository<PersonPhone, MappedPersonPhoneId>,
                CrudRepository<PersonPhone, MappedPersonPhoneId> {

}
