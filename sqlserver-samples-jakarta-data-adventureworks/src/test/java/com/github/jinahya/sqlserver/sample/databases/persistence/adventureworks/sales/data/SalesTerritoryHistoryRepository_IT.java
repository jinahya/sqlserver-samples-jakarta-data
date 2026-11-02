package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesTerritoryHistoryId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SalesTerritoryHistory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesTerritoryHistoryRepository}.
 */
@AddBeanClasses(SalesTerritoryHistoryRepository_.class)
class SalesTerritoryHistoryRepository_IT
        extends _Repository_IT<SalesTerritoryHistoryRepository, SalesTerritoryHistory, MappedSalesTerritoryHistoryId> {

    SalesTerritoryHistoryRepository_IT() {
        super(SalesTerritoryHistoryRepository.class, SalesTerritoryHistory.class, MappedSalesTerritoryHistoryId.class);
    }
}
