package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.purchasing.ProductVendorId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.ProductVendor;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductVendor}.
 */
@Repository
public interface ProductVendorRepository
        extends _Repository<ProductVendor, ProductVendorId>,
                CrudRepository<ProductVendor, ProductVendorId> {

}
