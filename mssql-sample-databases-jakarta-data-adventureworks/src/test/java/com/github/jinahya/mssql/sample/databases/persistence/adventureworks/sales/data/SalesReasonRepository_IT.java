package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesReason;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesReasonRepository}.
 */
@AddBeanClasses(SalesReasonRepository_.class)
class SalesReasonRepository_IT
        extends _Repository_IT<SalesReasonRepository, SalesReason, Integer> {

    SalesReasonRepository_IT() {
        super(SalesReasonRepository.class, SalesReason.class, Integer.class);
    }
}
