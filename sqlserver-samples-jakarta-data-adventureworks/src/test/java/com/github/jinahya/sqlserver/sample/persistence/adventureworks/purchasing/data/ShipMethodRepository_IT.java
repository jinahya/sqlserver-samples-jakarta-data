package com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.ShipMethod;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.purchasing.data.ShipMethodRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ShipMethodRepository}.
 */
@AddBeanClasses(ShipMethodRepository_.class)
class ShipMethodRepository_IT
        extends _Repository_IT<ShipMethodRepository, ShipMethod, Integer> {

    ShipMethodRepository_IT() {
        super(ShipMethodRepository.class, ShipMethod.class, Integer.class);
    }
}
