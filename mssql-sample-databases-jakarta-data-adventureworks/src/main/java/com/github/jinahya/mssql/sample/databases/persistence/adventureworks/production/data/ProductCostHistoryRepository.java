package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductCostHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductCostHistory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductCostHistory}.
 */
@Repository
public interface ProductCostHistoryRepository
        extends _Repository<ProductCostHistory, MappedProductCostHistoryId>,
                CrudRepository<ProductCostHistory, MappedProductCostHistoryId> {

}
