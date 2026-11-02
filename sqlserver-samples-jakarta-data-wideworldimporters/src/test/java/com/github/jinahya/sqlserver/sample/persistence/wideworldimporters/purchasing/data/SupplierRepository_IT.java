package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.Supplier;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.purchasing.data.SupplierRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SupplierRepository}.
 */
@AddBeanClasses(SupplierRepository_.class)
class SupplierRepository_IT
        extends _Repository_IT<SupplierRepository, Supplier, Integer> {

    SupplierRepository_IT() {
        super(SupplierRepository.class, Supplier.class, Integer.class);
    }
}
