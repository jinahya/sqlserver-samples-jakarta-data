package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.TransactionHistoryArchive;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link TransactionHistoryArchive}.
 */
@Repository
public interface TransactionHistoryArchiveRepository
        extends _Repository<TransactionHistoryArchive, Integer>,
                CrudRepository<TransactionHistoryArchive, Integer> {

}
