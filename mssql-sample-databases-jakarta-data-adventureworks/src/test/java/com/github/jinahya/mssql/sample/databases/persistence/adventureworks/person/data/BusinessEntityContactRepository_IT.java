package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.person.MappedBusinessEntityContactId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.BusinessEntityContact;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link BusinessEntityContactRepository}.
 */
@AddBeanClasses(BusinessEntityContactRepository_.class)
class BusinessEntityContactRepository_IT
        extends _Repository_IT<BusinessEntityContactRepository, BusinessEntityContact, MappedBusinessEntityContactId> {

    BusinessEntityContactRepository_IT() {
        super(BusinessEntityContactRepository.class, BusinessEntityContact.class, MappedBusinessEntityContactId.class);
    }
}
