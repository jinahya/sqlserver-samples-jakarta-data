package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.WorkOrder;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link WorkOrderRepository}.
 */
@AddBeanClasses(WorkOrderRepository_.class)
class WorkOrderRepository_IT
        extends _Repository_IT<WorkOrderRepository, WorkOrder, Integer> {

    WorkOrderRepository_IT() {
        super(WorkOrderRepository.class, WorkOrder.class, Integer.class);
    }
}
