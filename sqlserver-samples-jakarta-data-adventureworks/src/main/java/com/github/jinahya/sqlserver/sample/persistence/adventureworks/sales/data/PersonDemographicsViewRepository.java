package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.PersonDemographicsView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PersonDemographicsView}.
 */
@Repository
public interface PersonDemographicsViewRepository
        extends _Repository<PersonDemographicsView, Integer>,
                CrudRepository<PersonDemographicsView, Integer> {

}
