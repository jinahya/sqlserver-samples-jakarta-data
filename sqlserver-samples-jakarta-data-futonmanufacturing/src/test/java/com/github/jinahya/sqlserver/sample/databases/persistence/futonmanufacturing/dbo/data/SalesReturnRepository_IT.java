package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesReturn;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesReturnRepository}.
 */
@AddBeanClasses(SalesReturnRepository_.class)
class SalesReturnRepository_IT
        extends _Repository_IT<SalesReturnRepository, SalesReturn, Integer> {

    SalesReturnRepository_IT() {
        super(SalesReturnRepository.class, SalesReturn.class, Integer.class);
    }
}
