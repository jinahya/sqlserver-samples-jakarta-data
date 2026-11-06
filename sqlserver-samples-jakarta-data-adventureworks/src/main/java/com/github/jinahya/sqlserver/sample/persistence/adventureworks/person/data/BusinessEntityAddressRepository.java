package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.BusinessEntityAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityAddress;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link BusinessEntityAddress}.
 */
@Repository
public interface BusinessEntityAddressRepository
        extends _Repository<BusinessEntityAddress, BusinessEntityAddressId>,
                CrudRepository<BusinessEntityAddress, BusinessEntityAddressId> {

}
