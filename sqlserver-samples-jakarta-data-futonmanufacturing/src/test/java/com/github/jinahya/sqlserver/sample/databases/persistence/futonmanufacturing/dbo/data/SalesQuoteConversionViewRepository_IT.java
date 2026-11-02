package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteConversionView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesQuoteConversionViewRepository}.
 */
@AddBeanClasses(SalesQuoteConversionViewRepository_.class)
class SalesQuoteConversionViewRepository_IT
        extends _Repository_IT<SalesQuoteConversionViewRepository, SalesQuoteConversionView, String> {

    SalesQuoteConversionViewRepository_IT() {
        super(SalesQuoteConversionViewRepository.class, SalesQuoteConversionView.class, String.class);
    }
}
