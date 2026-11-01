package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesReturnDetail;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesReturnDetailRepository}.
 */
@AddBeanClasses(SalesReturnDetailRepository_.class)
class SalesReturnDetailRepository_IT
        extends _Repository_IT<SalesReturnDetailRepository, SalesReturnDetail, Integer> {

    SalesReturnDetailRepository_IT() {
        super(SalesReturnDetailRepository.class, SalesReturnDetail.class, Integer.class);
    }
}
