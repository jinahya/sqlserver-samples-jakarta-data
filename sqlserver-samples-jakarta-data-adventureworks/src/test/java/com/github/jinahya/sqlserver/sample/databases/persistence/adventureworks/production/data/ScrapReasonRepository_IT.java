package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ScrapReason;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ScrapReasonRepository}.
 */
@AddBeanClasses(ScrapReasonRepository_.class)
class ScrapReasonRepository_IT
        extends _Repository_IT<ScrapReasonRepository, ScrapReason, Short> {

    ScrapReasonRepository_IT() {
        super(ScrapReasonRepository.class, ScrapReason.class, Short.class);
    }
}
