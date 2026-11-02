package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedProductProductPhotoId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductProductPhoto;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductProductPhoto}.
 */
@Repository
public interface ProductProductPhotoRepository
        extends _Repository<ProductProductPhoto, MappedProductProductPhotoId>,
                CrudRepository<ProductProductPhoto, MappedProductProductPhotoId> {

}
