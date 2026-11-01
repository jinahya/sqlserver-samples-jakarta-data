package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.Invoice;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link Invoice}.
 */
@Repository
public interface InvoiceRepository
        extends _Repository<Invoice, Integer>,
                CrudRepository<Invoice, Integer> {

}
