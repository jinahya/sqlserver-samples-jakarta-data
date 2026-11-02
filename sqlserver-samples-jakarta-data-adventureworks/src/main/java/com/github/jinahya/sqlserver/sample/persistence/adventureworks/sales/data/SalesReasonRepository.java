package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesReason;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesReason}.
 */
@Repository
public interface SalesReasonRepository
        extends _Repository<SalesReason, Integer>,
                CrudRepository<SalesReason, Integer> {

}
