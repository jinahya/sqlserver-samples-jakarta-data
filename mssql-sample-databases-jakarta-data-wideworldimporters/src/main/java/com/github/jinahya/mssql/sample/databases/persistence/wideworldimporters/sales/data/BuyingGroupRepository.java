package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.BuyingGroup;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link BuyingGroup}.
 */
@Repository
public interface BuyingGroupRepository
        extends _Repository<BuyingGroup, Integer>,
                CrudRepository<BuyingGroup, Integer> {

}
