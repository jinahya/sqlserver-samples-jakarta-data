package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.person.MappedBusinessEntityAddressId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.BusinessEntityAddress;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link BusinessEntityAddress}.
 */
@Repository
public interface BusinessEntityAddressRepository
        extends _Repository<BusinessEntityAddress, MappedBusinessEntityAddressId>,
                CrudRepository<BusinessEntityAddress, MappedBusinessEntityAddressId> {

}
