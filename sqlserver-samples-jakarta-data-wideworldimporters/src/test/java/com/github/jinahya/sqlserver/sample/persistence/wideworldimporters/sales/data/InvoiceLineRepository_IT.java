package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.InvoiceLine;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.sales.data.InvoiceLineRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link InvoiceLineRepository}.
 */
@AddBeanClasses(InvoiceLineRepository_.class)
class InvoiceLineRepository_IT
        extends _Repository_IT<InvoiceLineRepository, InvoiceLine, Integer> {

    InvoiceLineRepository_IT() {
        super(InvoiceLineRepository.class, InvoiceLine.class, Integer.class);
    }
}
