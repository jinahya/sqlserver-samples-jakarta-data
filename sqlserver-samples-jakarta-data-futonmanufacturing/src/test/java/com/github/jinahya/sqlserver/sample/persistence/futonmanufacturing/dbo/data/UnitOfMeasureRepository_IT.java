package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.UnitOfMeasure;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.UnitOfMeasureRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link UnitOfMeasureRepository}.
 */
@AddBeanClasses(UnitOfMeasureRepository_.class)
class UnitOfMeasureRepository_IT
        extends _Repository_IT<UnitOfMeasureRepository, UnitOfMeasure, Integer> {

    UnitOfMeasureRepository_IT() {
        super(UnitOfMeasureRepository.class, UnitOfMeasure.class, Integer.class);
    }
}
