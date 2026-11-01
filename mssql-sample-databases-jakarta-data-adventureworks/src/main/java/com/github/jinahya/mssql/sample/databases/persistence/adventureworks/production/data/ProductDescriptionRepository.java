package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductDescription;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductDescription}.
 */
@Repository
public interface ProductDescriptionRepository
        extends _Repository<ProductDescription, Integer>,
                CrudRepository<ProductDescription, Integer> {

}
