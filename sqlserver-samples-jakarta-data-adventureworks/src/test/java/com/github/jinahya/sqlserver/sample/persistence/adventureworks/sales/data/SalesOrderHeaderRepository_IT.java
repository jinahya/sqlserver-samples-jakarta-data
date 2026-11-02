package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesOrderHeader;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesOrderHeaderRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderHeaderRepository}.
 */
@AddBeanClasses(SalesOrderHeaderRepository_.class)
class SalesOrderHeaderRepository_IT
        extends _Repository_IT<SalesOrderHeaderRepository, SalesOrderHeader, Integer> {

    SalesOrderHeaderRepository_IT() {
        super(SalesOrderHeaderRepository.class, SalesOrderHeader.class, Integer.class);
    }
}
