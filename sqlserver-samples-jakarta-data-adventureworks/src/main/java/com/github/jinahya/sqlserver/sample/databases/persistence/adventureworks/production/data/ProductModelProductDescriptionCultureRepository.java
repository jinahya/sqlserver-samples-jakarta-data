package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedProductModelProductDescriptionCultureId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductModelProductDescriptionCulture;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductModelProductDescriptionCulture}.
 */
@Repository
public interface ProductModelProductDescriptionCultureRepository
        extends _Repository<ProductModelProductDescriptionCulture, MappedProductModelProductDescriptionCultureId>,
                CrudRepository<ProductModelProductDescriptionCulture, MappedProductModelProductDescriptionCultureId> {

}
