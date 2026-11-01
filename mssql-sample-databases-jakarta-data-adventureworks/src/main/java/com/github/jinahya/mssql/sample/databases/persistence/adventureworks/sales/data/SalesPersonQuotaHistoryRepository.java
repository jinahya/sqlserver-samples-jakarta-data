package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.sales.MappedSalesPersonQuotaHistoryId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.sales.SalesPersonQuotaHistory;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesPersonQuotaHistory}.
 */
@Repository
public interface SalesPersonQuotaHistoryRepository
        extends _Repository<SalesPersonQuotaHistory, MappedSalesPersonQuotaHistoryId>,
                CrudRepository<SalesPersonQuotaHistory, MappedSalesPersonQuotaHistoryId> {

}
