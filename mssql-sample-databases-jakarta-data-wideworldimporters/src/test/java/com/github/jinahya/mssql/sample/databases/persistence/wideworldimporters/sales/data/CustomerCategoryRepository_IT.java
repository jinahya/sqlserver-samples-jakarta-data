package com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.data;

import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.wideworldimporters.sales.CustomerCategory;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link CustomerCategoryRepository}.
 */
@AddBeanClasses(CustomerCategoryRepository_.class)
class CustomerCategoryRepository_IT
        extends _Repository_IT<CustomerCategoryRepository, CustomerCategory, Integer> {

    CustomerCategoryRepository_IT() {
        super(CustomerCategoryRepository.class, CustomerCategory.class, Integer.class);
    }
}
