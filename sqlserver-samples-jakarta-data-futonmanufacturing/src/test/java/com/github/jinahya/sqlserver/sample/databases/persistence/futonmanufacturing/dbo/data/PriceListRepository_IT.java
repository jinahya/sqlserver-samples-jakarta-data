package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.PriceList;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PriceListRepository}.
 */
@AddBeanClasses(PriceListRepository_.class)
class PriceListRepository_IT
        extends _Repository_IT<PriceListRepository, PriceList, Integer> {

    PriceListRepository_IT() {
        super(PriceListRepository.class, PriceList.class, Integer.class);
    }
}
