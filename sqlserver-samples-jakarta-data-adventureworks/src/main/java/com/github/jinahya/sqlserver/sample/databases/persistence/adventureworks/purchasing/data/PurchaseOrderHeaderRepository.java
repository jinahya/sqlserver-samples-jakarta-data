package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.purchasing.PurchaseOrderHeader;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PurchaseOrderHeader}.
 */
@Repository
public interface PurchaseOrderHeaderRepository
        extends _Repository<PurchaseOrderHeader, Integer>,
                CrudRepository<PurchaseOrderHeader, Integer> {

}
