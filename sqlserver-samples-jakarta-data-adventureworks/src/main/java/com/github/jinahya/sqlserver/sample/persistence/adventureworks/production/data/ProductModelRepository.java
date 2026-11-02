package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModel;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductModel}.
 */
@Repository
public interface ProductModelRepository
        extends _Repository<ProductModel, Integer>,
                CrudRepository<ProductModel, Integer> {

}
