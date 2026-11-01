package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.Warehouse;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link WarehouseRepository}.
 */
@AddBeanClasses(WarehouseRepository_.class)
class WarehouseRepository_IT
        extends _Repository_IT<WarehouseRepository, Warehouse, Integer> {

    WarehouseRepository_IT() {
        super(WarehouseRepository.class, Warehouse.class, Integer.class);
    }
}
