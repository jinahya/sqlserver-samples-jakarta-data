package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.TransactionHistoryArchive;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.TransactionHistoryArchiveRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link TransactionHistoryArchiveRepository}.
 */
@AddBeanClasses(TransactionHistoryArchiveRepository_.class)
class TransactionHistoryArchiveRepository_IT
        extends _Repository_IT<TransactionHistoryArchiveRepository, TransactionHistoryArchive, Integer> {

    TransactionHistoryArchiveRepository_IT() {
        super(TransactionHistoryArchiveRepository.class, TransactionHistoryArchive.class, Integer.class);
    }
}
