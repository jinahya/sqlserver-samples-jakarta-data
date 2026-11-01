package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PriceListDetail;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PriceListDetailRepository}.
 */
@AddBeanClasses(PriceListDetailRepository_.class)
class PriceListDetailRepository_IT
        extends _Repository_IT<PriceListDetailRepository, PriceListDetail, Integer> {

    PriceListDetailRepository_IT() {
        super(PriceListDetailRepository.class, PriceListDetail.class, Integer.class);
    }
}
