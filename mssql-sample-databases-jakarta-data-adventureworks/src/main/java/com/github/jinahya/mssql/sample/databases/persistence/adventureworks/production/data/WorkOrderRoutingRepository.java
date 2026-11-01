package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedWorkOrderRoutingId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.WorkOrderRouting;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link WorkOrderRouting}.
 */
@Repository
public interface WorkOrderRoutingRepository
        extends _Repository<WorkOrderRouting, MappedWorkOrderRoutingId>,
                CrudRepository<WorkOrderRouting, MappedWorkOrderRoutingId> {

}
