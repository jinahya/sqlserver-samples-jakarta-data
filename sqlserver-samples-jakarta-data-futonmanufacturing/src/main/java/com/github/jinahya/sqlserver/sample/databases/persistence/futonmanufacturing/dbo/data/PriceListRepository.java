package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.PriceList;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PriceList}.
 */
@Repository
public interface PriceListRepository
        extends _Repository<PriceList, Integer>,
                CrudRepository<PriceList, Integer> {

}
