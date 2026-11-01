package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.Illustration;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Illustration}.
 */
@Repository
public interface IllustrationRepository
        extends _Repository<Illustration, Integer>,
                CrudRepository<Illustration, Integer> {

}
