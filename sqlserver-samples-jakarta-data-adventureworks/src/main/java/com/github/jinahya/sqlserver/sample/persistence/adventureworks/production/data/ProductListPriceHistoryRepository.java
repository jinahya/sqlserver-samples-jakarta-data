package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductListPriceHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductListPriceHistory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductListPriceHistory}.
 */
@Repository
public interface ProductListPriceHistoryRepository
        extends _Repository<ProductListPriceHistory, ProductListPriceHistoryId>,
                CrudRepository<ProductListPriceHistory, ProductListPriceHistoryId> {

}
