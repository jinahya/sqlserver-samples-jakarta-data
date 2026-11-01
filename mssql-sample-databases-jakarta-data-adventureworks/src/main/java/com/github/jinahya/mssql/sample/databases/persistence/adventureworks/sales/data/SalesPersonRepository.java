package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPerson;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesPerson}.
 */
@Repository
public interface SalesPersonRepository
        extends _Repository<SalesPerson, Integer>,
                CrudRepository<SalesPerson, Integer> {

}
