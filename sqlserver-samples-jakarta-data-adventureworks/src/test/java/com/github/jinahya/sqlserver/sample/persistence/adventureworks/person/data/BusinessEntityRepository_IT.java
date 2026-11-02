package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.BusinessEntity;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.BusinessEntityRepository;
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
