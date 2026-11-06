package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductProductPhotoId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductProductPhoto;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductProductPhoto}.
 */
@Repository
public interface ProductProductPhotoRepository
        extends _Repository<ProductProductPhoto, ProductProductPhotoId>,
                CrudRepository<ProductProductPhoto, ProductProductPhotoId> {

}
