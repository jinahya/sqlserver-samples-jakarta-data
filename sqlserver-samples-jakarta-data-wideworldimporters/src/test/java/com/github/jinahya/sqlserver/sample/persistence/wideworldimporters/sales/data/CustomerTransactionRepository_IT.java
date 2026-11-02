package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.CustomerTransaction;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.CustomerTransactionRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CustomerTransactionRepository}.
 */
@AddBeanClasses(CustomerTransactionRepository_.class)
class CustomerTransactionRepository_IT
        extends _Repository_IT<CustomerTransactionRepository, CustomerTransaction, Integer> {

    CustomerTransactionRepository_IT() {
        super(CustomerTransactionRepository.class, CustomerTransaction.class, Integer.class);
    }
}
