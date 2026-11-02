package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesOrderDetail;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.SalesOrderDetailRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesOrderDetailRepository}.
 */
@AddBeanClasses(SalesOrderDetailRepository_.class)
class SalesOrderDetailRepository_IT
        extends _Repository_IT<SalesOrderDetailRepository, SalesOrderDetail, Integer> {

    SalesOrderDetailRepository_IT() {
        super(SalesOrderDetailRepository.class, SalesOrderDetail.class, Integer.class);
    }
}
