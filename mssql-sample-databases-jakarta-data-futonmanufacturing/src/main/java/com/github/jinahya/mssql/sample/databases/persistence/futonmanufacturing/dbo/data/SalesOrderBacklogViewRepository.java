package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesOrderBacklogView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesOrderBacklogView}.
 */
@Repository
public interface SalesOrderBacklogViewRepository
        extends _Repository<SalesOrderBacklogView, String>,
                CrudRepository<SalesOrderBacklogView, String> {

}
