package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.BusinessEntityAddressId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityAddress;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.BusinessEntityAddressRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link BusinessEntityAddressRepository}.
 */
@AddBeanClasses(BusinessEntityAddressRepository_.class)
class BusinessEntityAddressRepository_IT
        extends _Repository_IT<BusinessEntityAddressRepository, BusinessEntityAddress, BusinessEntityAddressId> {

    BusinessEntityAddressRepository_IT() {
        super(BusinessEntityAddressRepository.class, BusinessEntityAddress.class, BusinessEntityAddressId.class);
    }
}
