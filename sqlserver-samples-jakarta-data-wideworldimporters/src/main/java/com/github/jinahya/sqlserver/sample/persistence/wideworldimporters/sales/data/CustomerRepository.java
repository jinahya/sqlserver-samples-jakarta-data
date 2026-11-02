package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.Customer;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Customer}.
 */
@Repository
public interface CustomerRepository
        extends _Repository<Customer, Integer>,
                CrudRepository<Customer, Integer> {

}
