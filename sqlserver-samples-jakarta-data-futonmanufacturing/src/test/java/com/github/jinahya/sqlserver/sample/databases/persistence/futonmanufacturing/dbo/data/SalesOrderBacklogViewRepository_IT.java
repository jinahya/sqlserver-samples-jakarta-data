package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.SalesOrderBacklogView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderBacklogViewRepository}.
 */
@AddBeanClasses(SalesOrderBacklogViewRepository_.class)
class SalesOrderBacklogViewRepository_IT
        extends _Repository_IT<SalesOrderBacklogViewRepository, SalesOrderBacklogView, String> {

    SalesOrderBacklogViewRepository_IT() {
        super(SalesOrderBacklogViewRepository.class, SalesOrderBacklogView.class, String.class);
    }
}
