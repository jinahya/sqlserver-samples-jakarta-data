package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductPhoto;
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
