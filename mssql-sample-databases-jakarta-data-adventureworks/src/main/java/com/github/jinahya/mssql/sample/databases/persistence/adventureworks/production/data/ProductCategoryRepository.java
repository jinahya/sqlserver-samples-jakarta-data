package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductCategory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductCategory}.
 */
@Repository
public interface ProductCategoryRepository
        extends _Repository<ProductCategory, Integer>,
                CrudRepository<ProductCategory, Integer> {

}
