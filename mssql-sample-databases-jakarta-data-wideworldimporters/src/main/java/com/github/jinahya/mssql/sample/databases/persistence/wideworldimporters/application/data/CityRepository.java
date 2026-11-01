package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.City;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link City}.
 */
@Repository
public interface CityRepository
        extends _Repository<City, Integer>,
                CrudRepository<City, Integer> {

}
