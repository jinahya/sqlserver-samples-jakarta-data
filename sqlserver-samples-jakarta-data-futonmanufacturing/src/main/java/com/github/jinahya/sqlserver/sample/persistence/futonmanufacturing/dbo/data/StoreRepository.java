package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.Store;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Store}.
 */
@Repository
public interface StoreRepository
        extends _Repository<Store, Integer>,
                CrudRepository<Store, Integer> {

}
