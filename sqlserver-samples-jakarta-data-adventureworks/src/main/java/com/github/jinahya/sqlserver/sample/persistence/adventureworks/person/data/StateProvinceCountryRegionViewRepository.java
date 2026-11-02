package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.StateProvinceCountryRegionView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StateProvinceCountryRegionView}.
 */
@Repository
public interface StateProvinceCountryRegionViewRepository
        extends _Repository<StateProvinceCountryRegionView, Integer>,
                CrudRepository<StateProvinceCountryRegionView, Integer> {

}
