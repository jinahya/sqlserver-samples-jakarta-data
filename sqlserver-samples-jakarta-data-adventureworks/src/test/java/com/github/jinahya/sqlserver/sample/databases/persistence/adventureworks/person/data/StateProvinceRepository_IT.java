package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.StateProvince;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StateProvinceRepository}.
 */
@AddBeanClasses(StateProvinceRepository_.class)
class StateProvinceRepository_IT
        extends _Repository_IT<StateProvinceRepository, StateProvince, Integer> {

    StateProvinceRepository_IT() {
        super(StateProvinceRepository.class, StateProvince.class, Integer.class);
    }
}
