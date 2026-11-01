package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.BusinessEntity;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link BusinessEntityRepository}.
 */
@AddBeanClasses(BusinessEntityRepository_.class)
class BusinessEntityRepository_IT
        extends _Repository_IT<BusinessEntityRepository, BusinessEntity, Integer> {

    BusinessEntityRepository_IT() {
        super(BusinessEntityRepository.class, BusinessEntity.class, Integer.class);
    }
}
