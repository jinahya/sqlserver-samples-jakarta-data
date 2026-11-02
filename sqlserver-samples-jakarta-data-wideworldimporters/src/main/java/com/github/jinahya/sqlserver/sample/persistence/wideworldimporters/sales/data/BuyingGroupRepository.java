package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.BuyingGroup;
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
