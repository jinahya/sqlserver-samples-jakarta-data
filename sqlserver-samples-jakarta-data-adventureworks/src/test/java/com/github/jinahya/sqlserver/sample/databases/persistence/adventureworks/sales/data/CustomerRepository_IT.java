package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.Customer;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CustomerRepository}.
 */
@AddBeanClasses(CustomerRepository_.class)
class CustomerRepository_IT
        extends _Repository_IT<CustomerRepository, Customer, Integer> {

    CustomerRepository_IT() {
        super(CustomerRepository.class, Customer.class, Integer.class);
    }
}
