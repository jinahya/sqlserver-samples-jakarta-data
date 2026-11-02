package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.Order;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.OrderRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link OrderRepository}.
 */
@AddBeanClasses(OrderRepository_.class)
class OrderRepository_IT
        extends _Repository_IT<OrderRepository, Order, Integer> {

    OrderRepository_IT() {
        super(OrderRepository.class, Order.class, Integer.class);
    }
}
