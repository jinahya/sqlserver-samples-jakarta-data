package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonDemographicsView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.PersonDemographicsViewRepository;
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
