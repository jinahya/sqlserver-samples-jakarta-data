package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.sales.InvoiceLine;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link InvoiceLine}.
 */
@Repository
public interface InvoiceLineRepository
        extends _Repository<InvoiceLine, Integer>,
                CrudRepository<InvoiceLine, Integer> {

}
