package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.dbo.AwBuildVersion;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link AwBuildVersionRepository}.
 */
@AddBeanClasses(AwBuildVersionRepository_.class)
class AwBuildVersionRepository_IT
        extends _Repository_IT<AwBuildVersionRepository, AwBuildVersion, Short> {

    AwBuildVersionRepository_IT() {
        super(AwBuildVersionRepository.class, AwBuildVersion.class, Short.class);
    }
}
