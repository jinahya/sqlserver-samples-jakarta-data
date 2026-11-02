package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesTaxRate;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesTaxRate}.
 */
@Repository
public interface SalesTaxRateRepository
        extends _Repository<SalesTaxRate, Integer>,
                CrudRepository<SalesTaxRate, Integer> {

}
