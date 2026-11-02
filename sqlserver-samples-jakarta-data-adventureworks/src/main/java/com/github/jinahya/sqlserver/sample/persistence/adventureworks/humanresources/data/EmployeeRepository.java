package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.Employee;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Employee}.
 */
@Repository
public interface EmployeeRepository
        extends _Repository<Employee, Integer>,
                CrudRepository<Employee, Integer> {

}
