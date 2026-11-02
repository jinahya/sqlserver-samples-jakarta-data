package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.production.ProductReview;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductReview}.
 */
@Repository
public interface ProductReviewRepository
        extends _Repository<ProductReview, Integer>,
                CrudRepository<ProductReview, Integer> {

}
