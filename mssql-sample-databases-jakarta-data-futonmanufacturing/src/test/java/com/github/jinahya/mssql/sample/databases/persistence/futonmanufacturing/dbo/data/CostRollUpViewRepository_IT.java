package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.CostRollUpView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CostRollUpViewRepository}.
 */
@AddBeanClasses(CostRollUpViewRepository_.class)
class CostRollUpViewRepository_IT
        extends _Repository_IT<CostRollUpViewRepository, CostRollUpView, String> {

    CostRollUpViewRepository_IT() {
        super(CostRollUpViewRepository.class, CostRollUpView.class, String.class);
    }
}
