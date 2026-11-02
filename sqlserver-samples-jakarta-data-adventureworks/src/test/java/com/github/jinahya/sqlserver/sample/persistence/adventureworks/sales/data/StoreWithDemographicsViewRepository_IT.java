package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.StoreWithDemographicsView;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.StoreWithDemographicsViewRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link StoreWithDemographicsViewRepository}.
 */
@AddBeanClasses(StoreWithDemographicsViewRepository_.class)
class StoreWithDemographicsViewRepository_IT
        extends _Repository_IT<StoreWithDemographicsViewRepository, StoreWithDemographicsView, Integer> {

    StoreWithDemographicsViewRepository_IT() {
        super(StoreWithDemographicsViewRepository.class, StoreWithDemographicsView.class, Integer.class);
    }
}
