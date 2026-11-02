package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Culture;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.CultureRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CultureRepository}.
 */
@AddBeanClasses(CultureRepository_.class)
class CultureRepository_IT
        extends _Repository_IT<CultureRepository, Culture, String> {

    CultureRepository_IT() {
        super(CultureRepository.class, Culture.class, String.class);
    }
}
