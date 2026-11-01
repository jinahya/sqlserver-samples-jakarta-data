package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.Supplier;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Supplier}.
 */
@Repository
public interface SupplierRepository
        extends _Repository<Supplier, Integer>,
                CrudRepository<Supplier, Integer> {

}
