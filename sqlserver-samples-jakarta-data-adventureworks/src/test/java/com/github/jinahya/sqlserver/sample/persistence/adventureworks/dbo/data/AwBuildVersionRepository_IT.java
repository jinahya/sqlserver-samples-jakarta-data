package com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.AwBuildVersion;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.dbo.data.AwBuildVersionRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link AwBuildVersionRepository}.
 */
@AddBeanClasses(AwBuildVersionRepository_.class)
class AwBuildVersionRepository_IT
        extends _Repository_IT<AwBuildVersionRepository, AwBuildVersion, Long> {

    AwBuildVersionRepository_IT() {
        super(AwBuildVersionRepository.class, AwBuildVersion.class, Long.class);
    }
}
