package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.production.MappedWorkOrderRoutingId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.WorkOrderRouting;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link WorkOrderRoutingRepository}.
 */
@AddBeanClasses(WorkOrderRoutingRepository_.class)
class WorkOrderRoutingRepository_IT
        extends _Repository_IT<WorkOrderRoutingRepository, WorkOrderRouting, MappedWorkOrderRoutingId> {

    WorkOrderRoutingRepository_IT() {
        super(WorkOrderRoutingRepository.class, WorkOrderRouting.class, MappedWorkOrderRoutingId.class);
    }
}
