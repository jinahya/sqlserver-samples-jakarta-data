package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.ShoppingCartItem;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ShoppingCartItem}.
 */
@Repository
public interface ShoppingCartItemRepository
        extends _Repository<ShoppingCartItem, Integer>,
                CrudRepository<ShoppingCartItem, Integer> {

}
