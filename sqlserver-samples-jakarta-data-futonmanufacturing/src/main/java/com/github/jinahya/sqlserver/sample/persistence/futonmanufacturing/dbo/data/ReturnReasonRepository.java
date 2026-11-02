package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.ReturnReason;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ReturnReason}.
 */
@Repository
public interface ReturnReasonRepository
        extends _Repository<ReturnReason, Integer>,
                CrudRepository<ReturnReason, Integer> {

}
