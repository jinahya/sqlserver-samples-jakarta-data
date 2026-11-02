package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesChannelProfitabilityView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesChannelProfitabilityView}.
 */
@Repository
public interface SalesChannelProfitabilityViewRepository
        extends _Repository<SalesChannelProfitabilityView, String>,
                CrudRepository<SalesChannelProfitabilityView, String> {

}
