package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductListPriceHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductListPriceHistory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductListPriceHistoryRepository}.
 */
@AddBeanClasses(ProductListPriceHistoryRepository_.class)
class ProductListPriceHistoryRepository_IT
        extends _Repository_IT<ProductListPriceHistoryRepository, ProductListPriceHistory, MappedProductListPriceHistoryId> {

    ProductListPriceHistoryRepository_IT() {
        super(ProductListPriceHistoryRepository.class, ProductListPriceHistory.class, MappedProductListPriceHistoryId.class);
    }
}
