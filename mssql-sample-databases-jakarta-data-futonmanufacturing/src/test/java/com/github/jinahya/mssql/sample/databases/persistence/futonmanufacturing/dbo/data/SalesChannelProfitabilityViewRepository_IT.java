package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesChannelProfitabilityView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesChannelProfitabilityViewRepository}.
 */
@AddBeanClasses(SalesChannelProfitabilityViewRepository_.class)
class SalesChannelProfitabilityViewRepository_IT
        extends _Repository_IT<SalesChannelProfitabilityViewRepository, SalesChannelProfitabilityView, String> {

    SalesChannelProfitabilityViewRepository_IT() {
        super(SalesChannelProfitabilityViewRepository.class, SalesChannelProfitabilityView.class, String.class);
    }
}
