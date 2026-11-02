package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesPerson;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesPersonRepository}.
 */
@AddBeanClasses(SalesPersonRepository_.class)
class SalesPersonRepository_IT
        extends _Repository_IT<SalesPersonRepository, SalesPerson, Integer> {

    SalesPersonRepository_IT() {
        super(SalesPersonRepository.class, SalesPerson.class, Integer.class);
    }
}
