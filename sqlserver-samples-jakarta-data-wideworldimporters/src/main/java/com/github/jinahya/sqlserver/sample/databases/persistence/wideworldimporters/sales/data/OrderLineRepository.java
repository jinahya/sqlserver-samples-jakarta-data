package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.OrderLine;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link OrderLine}.
 */
@Repository
public interface OrderLineRepository
        extends _Repository<OrderLine, Integer>,
                CrudRepository<OrderLine, Integer> {

}
