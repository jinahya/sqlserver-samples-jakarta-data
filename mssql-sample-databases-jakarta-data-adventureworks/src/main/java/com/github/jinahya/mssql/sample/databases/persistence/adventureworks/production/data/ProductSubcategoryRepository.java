package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductSubcategory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductSubcategory}.
 */
@Repository
public interface ProductSubcategoryRepository
        extends _Repository<ProductSubcategory, Integer>,
                CrudRepository<ProductSubcategory, Integer> {

}
