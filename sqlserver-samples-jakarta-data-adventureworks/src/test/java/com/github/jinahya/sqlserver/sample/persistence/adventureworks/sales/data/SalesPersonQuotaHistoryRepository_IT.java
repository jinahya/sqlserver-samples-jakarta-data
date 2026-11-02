package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.MappedSalesPersonQuotaHistoryId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SalesPersonQuotaHistory;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SalesPersonQuotaHistoryRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SalesPersonQuotaHistoryRepository}.
 */
@AddBeanClasses(SalesPersonQuotaHistoryRepository_.class)
class SalesPersonQuotaHistoryRepository_IT
        extends _Repository_IT<SalesPersonQuotaHistoryRepository, SalesPersonQuotaHistory, MappedSalesPersonQuotaHistoryId> {

    SalesPersonQuotaHistoryRepository_IT() {
        super(SalesPersonQuotaHistoryRepository.class, SalesPersonQuotaHistory.class, MappedSalesPersonQuotaHistoryId.class);
    }
}
