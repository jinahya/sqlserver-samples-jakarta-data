package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.PersonDemographicsView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PersonDemographicsViewRepository}.
 */
@AddBeanClasses(PersonDemographicsViewRepository_.class)
class PersonDemographicsViewRepository_IT
        extends _Repository_IT<PersonDemographicsViewRepository, PersonDemographicsView, Integer> {

    PersonDemographicsViewRepository_IT() {
        super(PersonDemographicsViewRepository.class, PersonDemographicsView.class, Integer.class);
    }
}
