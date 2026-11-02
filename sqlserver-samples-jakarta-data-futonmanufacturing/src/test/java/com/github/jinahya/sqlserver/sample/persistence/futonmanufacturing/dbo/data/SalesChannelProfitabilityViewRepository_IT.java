package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesChannelProfitabilityView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesChannelProfitabilityViewRepository;
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
