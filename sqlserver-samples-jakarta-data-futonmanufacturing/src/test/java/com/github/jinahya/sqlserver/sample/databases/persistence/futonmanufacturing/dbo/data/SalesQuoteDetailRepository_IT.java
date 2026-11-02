package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteDetail;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesQuoteDetailRepository}.
 */
@AddBeanClasses(SalesQuoteDetailRepository_.class)
class SalesQuoteDetailRepository_IT
        extends _Repository_IT<SalesQuoteDetailRepository, SalesQuoteDetail, Integer> {

    SalesQuoteDetailRepository_IT() {
        super(SalesQuoteDetailRepository.class, SalesQuoteDetail.class, Integer.class);
    }
}
