package com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.futonmanufacturing.dbo.TransactionType;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link TransactionType}.
 */
@Repository
public interface TransactionTypeRepository
        extends _Repository<TransactionType, Integer>,
                CrudRepository<TransactionType, Integer> {

}
