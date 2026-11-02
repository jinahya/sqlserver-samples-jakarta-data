package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.AdditionalContactInfoView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link AdditionalContactInfoViewRepository}.
 */
@AddBeanClasses(AdditionalContactInfoViewRepository_.class)
class AdditionalContactInfoViewRepository_IT
        extends _Repository_IT<AdditionalContactInfoViewRepository, AdditionalContactInfoView, Integer> {

    AdditionalContactInfoViewRepository_IT() {
        super(AdditionalContactInfoViewRepository.class, AdditionalContactInfoView.class, Integer.class);
    }
}
