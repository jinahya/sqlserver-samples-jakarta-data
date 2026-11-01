package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesQuoteDetail}.
 */
@Repository
public interface SalesQuoteDetailRepository
        extends _Repository<SalesQuoteDetail, Integer>,
                CrudRepository<SalesQuoteDetail, Integer> {

}
