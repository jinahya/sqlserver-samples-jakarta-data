package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.EmployeeDepartmentHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.humanresources.EmployeeDepartmentHistoryId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link EmployeeDepartmentHistory}.
 */
@Repository
public interface EmployeeDepartmentHistoryRepository
        extends _Repository<EmployeeDepartmentHistory, EmployeeDepartmentHistoryId>,
                CrudRepository<EmployeeDepartmentHistory, EmployeeDepartmentHistoryId> {

}
