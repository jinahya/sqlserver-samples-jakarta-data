package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.TransactionHistory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link TransactionHistory}.
 */
@Repository
public interface TransactionHistoryRepository
        extends _Repository<TransactionHistory, Integer>,
                CrudRepository<TransactionHistory, Integer> {

}
