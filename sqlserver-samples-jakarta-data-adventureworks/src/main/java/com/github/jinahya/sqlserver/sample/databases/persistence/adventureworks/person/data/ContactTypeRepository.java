package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.ContactType;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ContactType}.
 */
@Repository
public interface ContactTypeRepository
        extends _Repository<ContactType, Integer>,
                CrudRepository<ContactType, Integer> {

}
