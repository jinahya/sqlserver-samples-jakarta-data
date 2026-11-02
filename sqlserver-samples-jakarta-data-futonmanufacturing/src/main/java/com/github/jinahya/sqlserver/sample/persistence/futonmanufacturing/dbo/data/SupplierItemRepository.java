package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SupplierItem;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SupplierItem}.
 */
@Repository
public interface SupplierItemRepository
        extends _Repository<SupplierItem, Integer>,
                CrudRepository<SupplierItem, Integer> {

}
