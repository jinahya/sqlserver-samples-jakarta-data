package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.purchasing.PurchaseOrderDetailId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.PurchaseOrderDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PurchaseOrderDetail}.
 */
@Repository
public interface PurchaseOrderDetailRepository
        extends _Repository<PurchaseOrderDetail, PurchaseOrderDetailId>,
                CrudRepository<PurchaseOrderDetail, PurchaseOrderDetailId> {

}
