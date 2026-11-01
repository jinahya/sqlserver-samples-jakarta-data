package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Supplier;
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
