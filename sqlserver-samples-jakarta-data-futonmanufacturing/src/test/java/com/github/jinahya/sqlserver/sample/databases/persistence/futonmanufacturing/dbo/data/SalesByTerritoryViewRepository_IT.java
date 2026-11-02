package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesByTerritoryView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesByTerritoryViewRepository}.
 */
@AddBeanClasses(SalesByTerritoryViewRepository_.class)
class SalesByTerritoryViewRepository_IT
        extends _Repository_IT<SalesByTerritoryViewRepository, SalesByTerritoryView, String> {

    SalesByTerritoryViewRepository_IT() {
        super(SalesByTerritoryViewRepository.class, SalesByTerritoryView.class, String.class);
    }
}
