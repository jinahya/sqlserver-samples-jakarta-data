package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.Department;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Department}.
 */
@Repository
public interface DepartmentRepository
        extends _Repository<Department, Short>,
                CrudRepository<Department, Short> {

}
