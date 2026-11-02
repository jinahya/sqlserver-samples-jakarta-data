package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.Illustration;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link IllustrationRepository}.
 */
@AddBeanClasses(IllustrationRepository_.class)
class IllustrationRepository_IT
        extends _Repository_IT<IllustrationRepository, Illustration, Integer> {

    IllustrationRepository_IT() {
        super(IllustrationRepository.class, Illustration.class, Integer.class);
    }
}
