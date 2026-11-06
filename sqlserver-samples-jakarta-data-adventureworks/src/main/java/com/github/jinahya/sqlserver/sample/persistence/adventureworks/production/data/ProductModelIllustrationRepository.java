package com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.production.ProductModelIllustrationId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.production.ProductModelIllustration;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductModelIllustration}.
 */
@Repository
public interface ProductModelIllustrationRepository
        extends _Repository<ProductModelIllustration, ProductModelIllustrationId>,
                CrudRepository<ProductModelIllustration, ProductModelIllustrationId> {

}
