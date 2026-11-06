package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SalesTerritoryHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesTerritoryHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesTerritoryHistoryRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesTerritoryHistoryRepository}.
 */
@AddBeanClasses(SalesTerritoryHistoryRepository_.class)
class SalesTerritoryHistoryRepository_IT
        extends _Repository_IT<SalesTerritoryHistoryRepository, SalesTerritoryHistory, SalesTerritoryHistoryId> {

    SalesTerritoryHistoryRepository_IT() {
        super(SalesTerritoryHistoryRepository.class, SalesTerritoryHistory.class, SalesTerritoryHistoryId.class);
    }
}
