package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductReview;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ProductReviewRepository}.
 */
@AddBeanClasses(ProductReviewRepository_.class)
class ProductReviewRepository_IT
        extends _Repository_IT<ProductReviewRepository, ProductReview, Integer> {

    ProductReviewRepository_IT() {
        super(ProductReviewRepository.class, ProductReview.class, Integer.class);
    }
}
