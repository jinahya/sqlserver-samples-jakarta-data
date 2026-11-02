package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductReview;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data.ProductReviewRepository;
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
