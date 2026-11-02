package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.EmployeePayHistory;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.humanresources.MappedEmployeePayHistoryId;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link EmployeePayHistory}.
 */
@Repository
public interface EmployeePayHistoryRepository
        extends _Repository<EmployeePayHistory, MappedEmployeePayHistoryId>,
                CrudRepository<EmployeePayHistory, MappedEmployeePayHistoryId> {

}
