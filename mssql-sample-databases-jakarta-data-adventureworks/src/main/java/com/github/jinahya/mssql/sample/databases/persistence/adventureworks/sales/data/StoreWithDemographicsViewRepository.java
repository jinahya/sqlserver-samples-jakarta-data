package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.StoreWithDemographicsView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link StoreWithDemographicsView}.
 */
@Repository
public interface StoreWithDemographicsViewRepository
        extends _Repository<StoreWithDemographicsView, Integer>,
                CrudRepository<StoreWithDemographicsView, Integer> {

}
