package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.VendorWithAddressesView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link VendorWithAddressesView}.
 */
@Repository
public interface VendorWithAddressesViewRepository
        extends _Repository<VendorWithAddressesView, Integer>,
                CrudRepository<VendorWithAddressesView, Integer> {

}
