package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesQuote;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesQuoteRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesQuoteRepository}.
 */
@AddBeanClasses(SalesQuoteRepository_.class)
class SalesQuoteRepository_IT
        extends _Repository_IT<SalesQuoteRepository, SalesQuote, Integer> {

    SalesQuoteRepository_IT() {
        super(SalesQuoteRepository.class, SalesQuote.class, Integer.class);
    }
}
