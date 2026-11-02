package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.ShoppingCartItem;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ShoppingCartItemRepository}.
 */
@AddBeanClasses(ShoppingCartItemRepository_.class)
class ShoppingCartItemRepository_IT
        extends _Repository_IT<ShoppingCartItemRepository, ShoppingCartItem, Integer> {

    ShoppingCartItemRepository_IT() {
        super(ShoppingCartItemRepository.class, ShoppingCartItem.class, Integer.class);
    }
}
