package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.TransactionType;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data.TransactionTypeRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link TransactionTypeRepository}.
 */
@AddBeanClasses(TransactionTypeRepository_.class)
class TransactionTypeRepository_IT
        extends _Repository_IT<TransactionTypeRepository, TransactionType, Integer> {

    TransactionTypeRepository_IT() {
        super(TransactionTypeRepository.class, TransactionType.class, Integer.class);
    }
}
