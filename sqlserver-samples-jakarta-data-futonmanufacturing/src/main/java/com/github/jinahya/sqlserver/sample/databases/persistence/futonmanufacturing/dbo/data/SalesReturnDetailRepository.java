package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesReturnDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesReturnDetail}.
 */
@Repository
public interface SalesReturnDetailRepository
        extends _Repository<SalesReturnDetail, Integer>,
                CrudRepository<SalesReturnDetail, Integer> {

}
