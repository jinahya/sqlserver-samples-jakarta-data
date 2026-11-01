package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.Vendor;
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
