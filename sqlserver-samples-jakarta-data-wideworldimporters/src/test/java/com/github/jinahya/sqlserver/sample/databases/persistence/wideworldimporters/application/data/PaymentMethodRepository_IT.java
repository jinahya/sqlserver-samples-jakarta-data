package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.PaymentMethod;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PaymentMethodRepository}.
 */
@AddBeanClasses(PaymentMethodRepository_.class)
class PaymentMethodRepository_IT
        extends _Repository_IT<PaymentMethodRepository, PaymentMethod, Integer> {

    PaymentMethodRepository_IT() {
        super(PaymentMethodRepository.class, PaymentMethod.class, Integer.class);
    }
}
