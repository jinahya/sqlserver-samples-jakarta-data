package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.ProductionOrder;
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
