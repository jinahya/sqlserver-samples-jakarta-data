package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.Vendor;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Vendor}.
 */
@Repository
public interface VendorRepository
        extends _Repository<Vendor, Integer>,
                CrudRepository<Vendor, Integer> {

}
