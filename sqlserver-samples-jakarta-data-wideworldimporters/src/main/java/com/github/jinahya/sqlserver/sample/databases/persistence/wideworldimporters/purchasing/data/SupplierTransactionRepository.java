package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.SupplierTransaction;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SupplierTransaction}.
 */
@Repository
public interface SupplierTransactionRepository
        extends _Repository<SupplierTransaction, Integer>,
                CrudRepository<SupplierTransaction, Integer> {

}
