package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.Document;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link DocumentRepository}.
 */
@AddBeanClasses(DocumentRepository_.class)
class DocumentRepository_IT
        extends _Repository_IT<DocumentRepository, Document, String> {

    DocumentRepository_IT() {
        super(DocumentRepository.class, Document.class, String.class);
    }
}
