package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.SupplierTransaction;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SupplierTransactionRepository}.
 */
@AddBeanClasses(SupplierTransactionRepository_.class)
class SupplierTransactionRepository_IT
        extends _Repository_IT<SupplierTransactionRepository, SupplierTransaction, Integer> {

    SupplierTransactionRepository_IT() {
        super(SupplierTransactionRepository.class, SupplierTransaction.class, Integer.class);
    }
}
