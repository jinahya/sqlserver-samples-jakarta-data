package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.TransactionType;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link TransactionType}.
 */
@Repository
public interface TransactionTypeRepository
        extends _Repository<TransactionType, Integer>,
                CrudRepository<TransactionType, Integer> {

}
