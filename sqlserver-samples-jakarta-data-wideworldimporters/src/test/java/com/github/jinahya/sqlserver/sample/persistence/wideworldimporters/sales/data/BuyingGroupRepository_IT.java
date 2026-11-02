package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.BuyingGroup;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.BuyingGroupRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link BuyingGroupRepository}.
 */
@AddBeanClasses(BuyingGroupRepository_.class)
class BuyingGroupRepository_IT
        extends _Repository_IT<BuyingGroupRepository, BuyingGroup, Integer> {

    BuyingGroupRepository_IT() {
        super(BuyingGroupRepository.class, BuyingGroup.class, Integer.class);
    }
}
