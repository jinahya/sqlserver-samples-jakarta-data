package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.DeliveryMethod;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link DeliveryMethodRepository}.
 */
@AddBeanClasses(DeliveryMethodRepository_.class)
class DeliveryMethodRepository_IT
        extends _Repository_IT<DeliveryMethodRepository, DeliveryMethod, Integer> {

    DeliveryMethodRepository_IT() {
        super(DeliveryMethodRepository.class, DeliveryMethod.class, Integer.class);
    }
}
