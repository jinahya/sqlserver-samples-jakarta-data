package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.warehouse.PackageType;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PackageType}.
 */
@Repository
public interface PackageTypeRepository
        extends _Repository<PackageType, Integer>,
                CrudRepository<PackageType, Integer> {

}
