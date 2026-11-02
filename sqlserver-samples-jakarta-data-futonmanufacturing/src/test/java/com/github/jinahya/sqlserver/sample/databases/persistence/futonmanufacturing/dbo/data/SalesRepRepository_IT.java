package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesRep;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesRepRepository}.
 */
@AddBeanClasses(SalesRepRepository_.class)
class SalesRepRepository_IT
        extends _Repository_IT<SalesRepRepository, SalesRep, Integer> {

    SalesRepRepository_IT() {
        super(SalesRepRepository.class, SalesRep.class, Integer.class);
    }
}
