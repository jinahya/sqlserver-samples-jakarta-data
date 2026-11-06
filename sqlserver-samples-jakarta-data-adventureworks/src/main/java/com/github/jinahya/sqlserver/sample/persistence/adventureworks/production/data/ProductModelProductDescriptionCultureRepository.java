package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelProductDescriptionCultureId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelProductDescriptionCulture;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductModelProductDescriptionCulture}.
 */
@Repository
public interface ProductModelProductDescriptionCultureRepository
        extends _Repository<ProductModelProductDescriptionCulture, ProductModelProductDescriptionCultureId>,
                CrudRepository<ProductModelProductDescriptionCulture, ProductModelProductDescriptionCultureId> {

}
