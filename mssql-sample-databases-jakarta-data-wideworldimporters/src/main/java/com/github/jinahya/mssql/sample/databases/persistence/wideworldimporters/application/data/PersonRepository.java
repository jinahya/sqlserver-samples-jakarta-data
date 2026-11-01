package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.Person;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Person}.
 */
@Repository
public interface PersonRepository
        extends _Repository<Person, Integer>,
                CrudRepository<Person, Integer> {

}
