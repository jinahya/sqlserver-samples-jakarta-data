package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductCostHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductCostHistory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductCostHistoryRepository}.
 */
@AddBeanClasses(ProductCostHistoryRepository_.class)
class ProductCostHistoryRepository_IT
        extends _Repository_IT<ProductCostHistoryRepository, ProductCostHistory, MappedProductCostHistoryId> {

    ProductCostHistoryRepository_IT() {
        super(ProductCostHistoryRepository.class, ProductCostHistory.class, MappedProductCostHistoryId.class);
    }
}
