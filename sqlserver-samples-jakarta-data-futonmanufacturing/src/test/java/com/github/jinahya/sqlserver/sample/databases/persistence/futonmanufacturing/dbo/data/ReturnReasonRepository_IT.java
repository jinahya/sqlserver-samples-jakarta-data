package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.ReturnReason;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ReturnReasonRepository}.
 */
@AddBeanClasses(ReturnReasonRepository_.class)
class ReturnReasonRepository_IT
        extends _Repository_IT<ReturnReasonRepository, ReturnReason, Integer> {

    ReturnReasonRepository_IT() {
        super(ReturnReasonRepository.class, ReturnReason.class, Integer.class);
    }
}
