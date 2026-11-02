package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.MappedBusinessEntityContactId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityContact;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link BusinessEntityContact}.
 */
@Repository
public interface BusinessEntityContactRepository
        extends _Repository<BusinessEntityContact, MappedBusinessEntityContactId>,
                CrudRepository<BusinessEntityContact, MappedBusinessEntityContactId> {

}
