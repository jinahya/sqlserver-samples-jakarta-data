package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.PersonPhoneId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.PersonPhone;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PersonPhone}.
 */
@Repository
public interface PersonPhoneRepository
        extends _Repository<PersonPhone, PersonPhoneId>,
                CrudRepository<PersonPhone, PersonPhoneId> {

}
