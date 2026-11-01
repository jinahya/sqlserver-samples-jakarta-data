package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductAndDescriptionViewId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductAndDescriptionView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductAndDescriptionView}.
 */
@Repository
public interface ProductAndDescriptionViewRepository
        extends _Repository<ProductAndDescriptionView, MappedProductAndDescriptionViewId>,
                CrudRepository<ProductAndDescriptionView, MappedProductAndDescriptionViewId> {

}
