package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductAndDescriptionViewId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductAndDescriptionView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductAndDescriptionView}.
 */
@Repository
public interface ProductAndDescriptionViewRepository
        extends _Repository<ProductAndDescriptionView, ProductAndDescriptionViewId>,
                CrudRepository<ProductAndDescriptionView, ProductAndDescriptionViewId> {

}
