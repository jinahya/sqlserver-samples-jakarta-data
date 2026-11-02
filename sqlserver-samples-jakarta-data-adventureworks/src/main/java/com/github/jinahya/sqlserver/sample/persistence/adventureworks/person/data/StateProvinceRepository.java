package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.StateProvince;
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
