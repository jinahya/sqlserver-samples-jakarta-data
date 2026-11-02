package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.PriceListDetail;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.PriceListDetailRepository;
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
