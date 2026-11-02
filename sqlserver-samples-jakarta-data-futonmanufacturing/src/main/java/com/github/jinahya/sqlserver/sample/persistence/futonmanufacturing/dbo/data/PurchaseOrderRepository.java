package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.PurchaseOrder;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PurchaseOrder}.
 */
@Repository
public interface PurchaseOrderRepository
        extends _Repository<PurchaseOrder, Integer>,
                CrudRepository<PurchaseOrder, Integer> {

}
