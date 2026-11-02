package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.TransactionHistory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link TransactionHistoryRepository}.
 */
@AddBeanClasses(TransactionHistoryRepository_.class)
class TransactionHistoryRepository_IT
        extends _Repository_IT<TransactionHistoryRepository, TransactionHistory, Integer> {

    TransactionHistoryRepository_IT() {
        super(TransactionHistoryRepository.class, TransactionHistory.class, Integer.class);
    }
}
