package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.BillOfMaterials;
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
