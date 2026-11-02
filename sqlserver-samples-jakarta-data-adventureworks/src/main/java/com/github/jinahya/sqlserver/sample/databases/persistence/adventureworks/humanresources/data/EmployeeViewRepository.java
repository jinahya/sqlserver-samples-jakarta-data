package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.EmployeeView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link EmployeeView}.
 */
@Repository
public interface EmployeeViewRepository
        extends _Repository<EmployeeView, Integer>,
                CrudRepository<EmployeeView, Integer> {

}
