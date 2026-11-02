package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.InventoryTurnoverView;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.InventoryTurnoverViewRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link InventoryTurnoverViewRepository}.
 */
@AddBeanClasses(InventoryTurnoverViewRepository_.class)
class InventoryTurnoverViewRepository_IT
        extends _Repository_IT<InventoryTurnoverViewRepository, InventoryTurnoverView, String> {

    InventoryTurnoverViewRepository_IT() {
        super(InventoryTurnoverViewRepository.class, InventoryTurnoverView.class, String.class);
    }
}
