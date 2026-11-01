package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.person.BusinessEntity;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link BusinessEntity}.
 */
@Repository
public interface BusinessEntityRepository
        extends _Repository<BusinessEntity, Integer>,
                CrudRepository<BusinessEntity, Integer> {

}
