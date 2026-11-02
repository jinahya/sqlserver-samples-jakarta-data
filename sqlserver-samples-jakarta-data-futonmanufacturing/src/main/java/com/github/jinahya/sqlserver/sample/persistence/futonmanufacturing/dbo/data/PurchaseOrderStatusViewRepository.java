package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.PurchaseOrderStatusView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PurchaseOrderStatusView}.
 */
@Repository
public interface PurchaseOrderStatusViewRepository
        extends _Repository<PurchaseOrderStatusView, String>,
                CrudRepository<PurchaseOrderStatusView, String> {

}
