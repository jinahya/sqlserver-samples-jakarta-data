package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.Country;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Country}.
 */
@Repository
public interface CountryRepository
        extends _Repository<Country, Integer>,
                CrudRepository<Country, Integer> {

}
