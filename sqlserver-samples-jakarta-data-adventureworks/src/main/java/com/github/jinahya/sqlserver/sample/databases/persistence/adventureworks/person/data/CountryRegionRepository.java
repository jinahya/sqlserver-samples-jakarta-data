package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.CountryRegion;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link CountryRegion}.
 */
@Repository
public interface CountryRegionRepository
        extends _Repository<CountryRegion, String>,
                CrudRepository<CountryRegion, String> {

}
