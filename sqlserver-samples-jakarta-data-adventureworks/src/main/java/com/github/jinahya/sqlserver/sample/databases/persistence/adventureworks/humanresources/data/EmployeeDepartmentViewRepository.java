package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.EmployeeDepartmentView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link EmployeeDepartmentView}.
 */
@Repository
public interface EmployeeDepartmentViewRepository
        extends _Repository<EmployeeDepartmentView, Integer>,
                CrudRepository<EmployeeDepartmentView, Integer> {

}
