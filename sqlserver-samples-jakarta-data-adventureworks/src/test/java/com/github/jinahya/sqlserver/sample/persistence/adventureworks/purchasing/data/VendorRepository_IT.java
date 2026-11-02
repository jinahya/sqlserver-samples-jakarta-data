package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.Vendor;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data.VendorRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link VendorRepository}.
 */
@AddBeanClasses(VendorRepository_.class)
class VendorRepository_IT
        extends _Repository_IT<VendorRepository, Vendor, Integer> {

    VendorRepository_IT() {
        super(VendorRepository.class, Vendor.class, Integer.class);
    }
}
