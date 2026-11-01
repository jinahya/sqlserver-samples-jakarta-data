package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.SpecialDeal;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SpecialDeal}.
 */
@Repository
public interface SpecialDealRepository
        extends _Repository<SpecialDeal, Integer>,
                CrudRepository<SpecialDeal, Integer> {

}
