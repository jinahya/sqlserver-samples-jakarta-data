package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.CustomerCategory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CustomerCategory}.
 */
@Repository
public interface CustomerCategoryRepository
        extends _Repository<CustomerCategory, Integer>,
                CrudRepository<CustomerCategory, Integer> {

}
