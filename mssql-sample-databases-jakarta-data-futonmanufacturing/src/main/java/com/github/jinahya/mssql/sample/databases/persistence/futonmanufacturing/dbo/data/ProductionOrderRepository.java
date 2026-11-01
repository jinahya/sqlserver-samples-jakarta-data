package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ProductionOrder;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductionOrder}.
 */
@Repository
public interface ProductionOrderRepository
        extends _Repository<ProductionOrder, Integer>,
                CrudRepository<ProductionOrder, Integer> {

}
