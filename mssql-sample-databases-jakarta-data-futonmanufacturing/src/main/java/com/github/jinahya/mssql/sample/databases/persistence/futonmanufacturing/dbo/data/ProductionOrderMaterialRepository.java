package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.ProductionOrderMaterial;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductionOrderMaterial}.
 */
@Repository
public interface ProductionOrderMaterialRepository
        extends _Repository<ProductionOrderMaterial, Integer>,
                CrudRepository<ProductionOrderMaterial, Integer> {

}
