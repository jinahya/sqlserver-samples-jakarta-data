package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.StateProvince;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StateProvince}.
 */
@Repository
public interface StateProvinceRepository
        extends _Repository<StateProvince, Integer>,
                CrudRepository<StateProvince, Integer> {

}
