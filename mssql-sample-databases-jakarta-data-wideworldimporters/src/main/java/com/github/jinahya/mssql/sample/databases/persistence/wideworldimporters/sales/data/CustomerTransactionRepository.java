package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.CustomerTransaction;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CustomerTransaction}.
 */
@Repository
public interface CustomerTransactionRepository
        extends _Repository<CustomerTransaction, Integer>,
                CrudRepository<CustomerTransaction, Integer> {

}
