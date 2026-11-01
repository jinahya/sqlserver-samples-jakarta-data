package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.EmployeeDepartmentHistory;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.humanresources.MappedEmployeeDepartmentHistoryId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link EmployeeDepartmentHistory}.
 */
@Repository
public interface EmployeeDepartmentHistoryRepository
        extends _Repository<EmployeeDepartmentHistory, MappedEmployeeDepartmentHistoryId>,
                CrudRepository<EmployeeDepartmentHistory, MappedEmployeeDepartmentHistoryId> {

}
