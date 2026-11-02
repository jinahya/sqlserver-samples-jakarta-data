package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.VendorWithAddressesView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data.VendorWithAddressesViewRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link VendorWithAddressesViewRepository}.
 */
@AddBeanClasses(VendorWithAddressesViewRepository_.class)
class VendorWithAddressesViewRepository_IT
        extends _Repository_IT<VendorWithAddressesViewRepository, VendorWithAddressesView, Integer> {

    VendorWithAddressesViewRepository_IT() {
        super(VendorWithAddressesViewRepository.class, VendorWithAddressesView.class, Integer.class);
    }
}
