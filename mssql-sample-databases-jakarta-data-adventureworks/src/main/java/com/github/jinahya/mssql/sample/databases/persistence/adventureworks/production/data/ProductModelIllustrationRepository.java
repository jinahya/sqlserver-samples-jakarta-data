package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.mapped.production.MappedProductModelIllustrationId;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.production.ProductModelIllustration;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link ProductModelIllustration}.
 */
@Repository
public interface ProductModelIllustrationRepository
        extends _Repository<ProductModelIllustration, MappedProductModelIllustrationId>,
                CrudRepository<ProductModelIllustration, MappedProductModelIllustrationId> {

}
