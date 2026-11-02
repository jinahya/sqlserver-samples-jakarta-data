package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesChannel;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesChannel}.
 */
@Repository
public interface SalesChannelRepository
        extends _Repository<SalesChannel, Integer>,
                CrudRepository<SalesChannel, Integer> {

}
