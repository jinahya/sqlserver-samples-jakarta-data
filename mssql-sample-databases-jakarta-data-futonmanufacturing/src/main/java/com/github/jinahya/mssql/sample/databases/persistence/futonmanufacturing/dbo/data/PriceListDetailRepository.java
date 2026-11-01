package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PriceListDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PriceListDetail}.
 */
@Repository
public interface PriceListDetailRepository
        extends _Repository<PriceListDetail, Integer>,
                CrudRepository<PriceListDetail, Integer> {

}
