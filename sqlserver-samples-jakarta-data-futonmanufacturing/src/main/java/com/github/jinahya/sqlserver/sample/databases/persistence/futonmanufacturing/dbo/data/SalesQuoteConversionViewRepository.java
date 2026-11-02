package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesQuoteConversionView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesQuoteConversionView}.
 */
@Repository
public interface SalesQuoteConversionViewRepository
        extends _Repository<SalesQuoteConversionView, String>,
                CrudRepository<SalesQuoteConversionView, String> {

}
