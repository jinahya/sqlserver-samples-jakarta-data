package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.PaymentMethod;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PaymentMethod}.
 */
@Repository
public interface PaymentMethodRepository
        extends _Repository<PaymentMethod, Integer>,
                CrudRepository<PaymentMethod, Integer> {

}
