package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.CreditCard;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CreditCard}.
 */
@Repository
public interface CreditCardRepository
        extends _Repository<CreditCard, Integer>,
                CrudRepository<CreditCard, Integer> {

}
