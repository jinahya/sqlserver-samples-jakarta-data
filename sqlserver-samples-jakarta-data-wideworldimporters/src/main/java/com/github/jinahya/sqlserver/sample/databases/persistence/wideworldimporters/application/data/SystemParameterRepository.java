package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.application.SystemParameter;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SystemParameter}.
 */
@Repository
public interface SystemParameterRepository
        extends _Repository<SystemParameter, Integer>,
                CrudRepository<SystemParameter, Integer> {

}
