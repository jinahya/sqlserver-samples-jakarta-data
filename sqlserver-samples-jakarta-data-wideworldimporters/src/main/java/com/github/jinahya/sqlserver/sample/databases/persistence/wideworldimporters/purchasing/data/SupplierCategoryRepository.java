package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.purchasing.SupplierCategory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SupplierCategory}.
 */
@Repository
public interface SupplierCategoryRepository
        extends _Repository<SupplierCategory, Integer>,
                CrudRepository<SupplierCategory, Integer> {

}
