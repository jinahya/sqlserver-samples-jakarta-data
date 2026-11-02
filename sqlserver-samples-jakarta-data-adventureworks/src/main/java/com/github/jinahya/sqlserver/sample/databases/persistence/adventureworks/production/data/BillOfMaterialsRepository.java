package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.BillOfMaterials;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link BillOfMaterials}.
 */
@Repository
public interface BillOfMaterialsRepository
        extends _Repository<BillOfMaterials, Integer>,
                CrudRepository<BillOfMaterials, Integer> {

}
