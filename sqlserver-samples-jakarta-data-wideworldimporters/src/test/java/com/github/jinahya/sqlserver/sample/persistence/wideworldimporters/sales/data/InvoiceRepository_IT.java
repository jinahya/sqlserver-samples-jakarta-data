package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.Invoice;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.InvoiceRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link InvoiceRepository}.
 */
@AddBeanClasses(InvoiceRepository_.class)
class InvoiceRepository_IT
        extends _Repository_IT<InvoiceRepository, Invoice, Integer> {

    InvoiceRepository_IT() {
        super(InvoiceRepository.class, Invoice.class, Integer.class);
    }
}
