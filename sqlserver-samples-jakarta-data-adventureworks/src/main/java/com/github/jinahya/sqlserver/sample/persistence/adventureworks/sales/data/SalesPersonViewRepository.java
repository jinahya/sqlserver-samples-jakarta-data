package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesPersonView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesPersonView}.
 */
@Repository
public interface SalesPersonViewRepository
        extends _Repository<SalesPersonView, Integer>,
                CrudRepository<SalesPersonView, Integer> {

}
