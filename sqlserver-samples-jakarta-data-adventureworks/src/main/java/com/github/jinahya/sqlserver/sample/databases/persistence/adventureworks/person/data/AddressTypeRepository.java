package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.AddressType;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link AddressType}.
 */
@Repository
public interface AddressTypeRepository
        extends _Repository<AddressType, Integer>,
                CrudRepository<AddressType, Integer> {

}
