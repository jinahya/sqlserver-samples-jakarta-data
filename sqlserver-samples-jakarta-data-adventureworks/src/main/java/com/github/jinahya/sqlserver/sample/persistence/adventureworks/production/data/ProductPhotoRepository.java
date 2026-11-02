package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductPhoto;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductPhoto}.
 */
@Repository
public interface ProductPhotoRepository
        extends _Repository<ProductPhoto, Integer>,
                CrudRepository<ProductPhoto, Integer> {

}
