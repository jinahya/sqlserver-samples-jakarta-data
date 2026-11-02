package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesReturn;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesReturn}.
 */
@Repository
public interface SalesReturnRepository
        extends _Repository<SalesReturn, Integer>,
                CrudRepository<SalesReturn, Integer> {

}
