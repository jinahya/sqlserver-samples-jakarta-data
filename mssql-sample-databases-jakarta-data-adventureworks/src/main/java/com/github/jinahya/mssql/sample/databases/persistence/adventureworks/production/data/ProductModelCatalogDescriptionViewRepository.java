package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductModelCatalogDescriptionView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductModelCatalogDescriptionView}.
 */
@Repository
public interface ProductModelCatalogDescriptionViewRepository
        extends _Repository<ProductModelCatalogDescriptionView, Integer>,
                CrudRepository<ProductModelCatalogDescriptionView, Integer> {

}
