package com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.futonmanufacturing.dbo.PurchaseOrderStatusView;
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
