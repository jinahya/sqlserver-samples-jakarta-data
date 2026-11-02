package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.Address;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link AddressRepository}.
 */
@AddBeanClasses(AddressRepository_.class)
class AddressRepository_IT
        extends _Repository_IT<AddressRepository, Address, Integer> {

    AddressRepository_IT() {
        super(AddressRepository.class, Address.class, Integer.class);
    }
}
