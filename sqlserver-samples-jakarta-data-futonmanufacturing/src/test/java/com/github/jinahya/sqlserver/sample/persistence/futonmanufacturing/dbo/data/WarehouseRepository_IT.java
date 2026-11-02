package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.Warehouse;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.WarehouseRepository;
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
