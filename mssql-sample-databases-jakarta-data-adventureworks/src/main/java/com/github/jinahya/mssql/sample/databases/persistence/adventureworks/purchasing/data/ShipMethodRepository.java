package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.purchasing.ShipMethod;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ShipMethod}.
 */
@Repository
public interface ShipMethodRepository
        extends _Repository<ShipMethod, Integer>,
                CrudRepository<ShipMethod, Integer> {

}
