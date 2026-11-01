package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.UnitMeasure;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link UnitMeasureRepository}.
 */
@AddBeanClasses(UnitMeasureRepository_.class)
class UnitMeasureRepository_IT
        extends _Repository_IT<UnitMeasureRepository, UnitMeasure, String> {

    UnitMeasureRepository_IT() {
        super(UnitMeasureRepository.class, UnitMeasure.class, String.class);
    }
}
