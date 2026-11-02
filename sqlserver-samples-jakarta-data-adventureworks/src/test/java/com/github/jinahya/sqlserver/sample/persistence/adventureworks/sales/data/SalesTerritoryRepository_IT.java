package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesTerritory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesTerritoryRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesTerritoryRepository}.
 */
@AddBeanClasses(SalesTerritoryRepository_.class)
class SalesTerritoryRepository_IT
        extends _Repository_IT<SalesTerritoryRepository, SalesTerritory, Integer> {

    SalesTerritoryRepository_IT() {
        super(SalesTerritoryRepository.class, SalesTerritory.class, Integer.class);
    }
}
