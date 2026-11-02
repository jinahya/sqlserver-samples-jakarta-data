package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.StockGroup;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StockGroupRepository}.
 */
@AddBeanClasses(StockGroupRepository_.class)
class StockGroupRepository_IT
        extends _Repository_IT<StockGroupRepository, StockGroup, Integer> {

    StockGroupRepository_IT() {
        super(StockGroupRepository.class, StockGroup.class, Integer.class);
    }
}
