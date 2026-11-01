package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.PurchaseOrder;
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
