package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.OrderLine;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link OrderLineRepository}.
 */
@AddBeanClasses(OrderLineRepository_.class)
class OrderLineRepository_IT
        extends _Repository_IT<OrderLineRepository, OrderLine, Integer> {

    OrderLineRepository_IT() {
        super(OrderLineRepository.class, OrderLine.class, Integer.class);
    }
}
