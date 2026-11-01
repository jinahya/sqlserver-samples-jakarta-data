package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.AddressType;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link AddressTypeRepository}.
 */
@AddBeanClasses(AddressTypeRepository_.class)
class AddressTypeRepository_IT
        extends _Repository_IT<AddressTypeRepository, AddressType, Integer> {

    AddressTypeRepository_IT() {
        super(AddressTypeRepository.class, AddressType.class, Integer.class);
    }
}
