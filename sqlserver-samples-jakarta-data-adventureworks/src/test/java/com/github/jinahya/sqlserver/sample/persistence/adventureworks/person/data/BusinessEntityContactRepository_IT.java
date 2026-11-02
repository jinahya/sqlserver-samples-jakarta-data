package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.person.MappedBusinessEntityContactId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntityContact;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.BusinessEntityContactRepository;
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
