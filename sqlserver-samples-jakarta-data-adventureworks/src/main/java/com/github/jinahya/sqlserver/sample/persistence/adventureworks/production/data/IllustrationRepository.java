package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.Illustration;
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
