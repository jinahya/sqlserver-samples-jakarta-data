package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.WorkCenterCapacityView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link WorkCenterCapacityViewRepository}.
 */
@AddBeanClasses(WorkCenterCapacityViewRepository_.class)
class WorkCenterCapacityViewRepository_IT
        extends _Repository_IT<WorkCenterCapacityViewRepository, WorkCenterCapacityView, String> {

    WorkCenterCapacityViewRepository_IT() {
        super(WorkCenterCapacityViewRepository.class, WorkCenterCapacityView.class, String.class);
    }
}
