package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesChannel;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesChannelRepository}.
 */
@AddBeanClasses(SalesChannelRepository_.class)
class SalesChannelRepository_IT
        extends _Repository_IT<SalesChannelRepository, SalesChannel, Integer> {

    SalesChannelRepository_IT() {
        super(SalesChannelRepository.class, SalesChannel.class, Integer.class);
    }
}
