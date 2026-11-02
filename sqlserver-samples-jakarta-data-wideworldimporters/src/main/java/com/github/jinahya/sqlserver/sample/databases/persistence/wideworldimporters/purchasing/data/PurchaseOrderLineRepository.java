package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.PurchaseOrderLine;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PurchaseOrderLine}.
 */
@Repository
public interface PurchaseOrderLineRepository
        extends _Repository<PurchaseOrderLine, Integer>,
                CrudRepository<PurchaseOrderLine, Integer> {

}
