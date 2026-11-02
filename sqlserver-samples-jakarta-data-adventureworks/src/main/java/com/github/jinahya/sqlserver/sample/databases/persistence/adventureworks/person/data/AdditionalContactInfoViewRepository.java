package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.AdditionalContactInfoView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link AdditionalContactInfoView}.
 */
@Repository
public interface AdditionalContactInfoViewRepository
        extends _Repository<AdditionalContactInfoView, Integer>,
                CrudRepository<AdditionalContactInfoView, Integer> {

}
