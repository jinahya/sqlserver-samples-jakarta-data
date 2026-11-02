package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesPersonSalesByFiscalYearsView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesPersonSalesByFiscalYearsView}.
 */
@Repository
public interface SalesPersonSalesByFiscalYearsViewRepository
        extends _Repository<SalesPersonSalesByFiscalYearsView, Integer>,
                CrudRepository<SalesPersonSalesByFiscalYearsView, Integer> {

}
