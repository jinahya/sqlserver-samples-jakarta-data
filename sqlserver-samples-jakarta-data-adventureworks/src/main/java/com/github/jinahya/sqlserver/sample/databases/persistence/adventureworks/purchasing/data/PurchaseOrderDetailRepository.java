package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.purchasing.MappedPurchaseOrderDetailId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.PurchaseOrderDetail;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PurchaseOrderDetail}.
 */
@Repository
public interface PurchaseOrderDetailRepository
        extends _Repository<PurchaseOrderDetail, MappedPurchaseOrderDetailId>,
                CrudRepository<PurchaseOrderDetail, MappedPurchaseOrderDetailId> {

}
