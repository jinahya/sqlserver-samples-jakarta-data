package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ScrapReason;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ScrapReason}.
 */
@Repository
public interface ScrapReasonRepository
        extends _Repository<ScrapReason, Long>,
                CrudRepository<ScrapReason, Long> {

}
