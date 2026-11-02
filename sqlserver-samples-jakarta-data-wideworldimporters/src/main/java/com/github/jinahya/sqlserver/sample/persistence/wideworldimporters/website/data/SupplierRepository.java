package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.website.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.website.Supplier;
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
