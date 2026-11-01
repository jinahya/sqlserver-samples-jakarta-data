package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.WorkCenter;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link WorkCenterRepository}.
 */
@AddBeanClasses(WorkCenterRepository_.class)
class WorkCenterRepository_IT
        extends _Repository_IT<WorkCenterRepository, WorkCenter, Integer> {

    WorkCenterRepository_IT() {
        super(WorkCenterRepository.class, WorkCenter.class, Integer.class);
    }
}
