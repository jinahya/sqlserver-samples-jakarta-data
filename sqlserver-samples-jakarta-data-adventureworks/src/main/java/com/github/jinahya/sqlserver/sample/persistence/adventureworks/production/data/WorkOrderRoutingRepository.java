package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.WorkOrderRoutingId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.WorkOrderRouting;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link WorkOrderRouting}.
 */
@Repository
public interface WorkOrderRoutingRepository
        extends _Repository<WorkOrderRouting, WorkOrderRoutingId>,
                CrudRepository<WorkOrderRouting, WorkOrderRoutingId> {

}
