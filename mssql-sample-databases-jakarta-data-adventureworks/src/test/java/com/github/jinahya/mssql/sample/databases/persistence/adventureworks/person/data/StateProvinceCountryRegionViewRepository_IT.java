package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.StateProvinceCountryRegionView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StateProvinceCountryRegionViewRepository}.
 */
@AddBeanClasses(StateProvinceCountryRegionViewRepository_.class)
class StateProvinceCountryRegionViewRepository_IT
        extends _Repository_IT<StateProvinceCountryRegionViewRepository, StateProvinceCountryRegionView, Integer> {

    StateProvinceCountryRegionViewRepository_IT() {
        super(StateProvinceCountryRegionViewRepository.class, StateProvinceCountryRegionView.class, Integer.class);
    }
}
