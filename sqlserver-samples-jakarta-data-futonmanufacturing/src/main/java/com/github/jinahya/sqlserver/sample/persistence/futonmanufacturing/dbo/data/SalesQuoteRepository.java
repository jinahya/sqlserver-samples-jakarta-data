package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesQuote;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesQuote}.
 */
@Repository
public interface SalesQuoteRepository
        extends _Repository<SalesQuote, Integer>,
                CrudRepository<SalesQuote, Integer> {

}
