package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.WorkOrder;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link WorkOrder}.
 */
@Repository
public interface WorkOrderRepository
        extends _Repository<WorkOrder, Integer>,
                CrudRepository<WorkOrder, Integer> {

}
