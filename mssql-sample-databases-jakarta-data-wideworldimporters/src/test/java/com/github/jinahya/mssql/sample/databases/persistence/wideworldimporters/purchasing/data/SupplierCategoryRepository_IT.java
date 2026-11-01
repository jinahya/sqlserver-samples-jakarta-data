package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.purchasing.SupplierCategory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SupplierCategoryRepository}.
 */
@AddBeanClasses(SupplierCategoryRepository_.class)
class SupplierCategoryRepository_IT
        extends _Repository_IT<SupplierCategoryRepository, SupplierCategory, Integer> {

    SupplierCategoryRepository_IT() {
        super(SupplierCategoryRepository.class, SupplierCategory.class, Integer.class);
    }
}
