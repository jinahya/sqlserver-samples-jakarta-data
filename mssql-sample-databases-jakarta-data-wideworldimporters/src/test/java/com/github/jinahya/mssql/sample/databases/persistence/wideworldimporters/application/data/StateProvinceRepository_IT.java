package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.application.StateProvince;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
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
