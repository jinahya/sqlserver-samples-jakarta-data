package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.mapped.sales.MappedSpecialOfferProductId;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.sales.SpecialOfferProduct;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SpecialOfferProduct}.
 */
@Repository
public interface SpecialOfferProductRepository
        extends _Repository<SpecialOfferProduct, MappedSpecialOfferProductId>,
                CrudRepository<SpecialOfferProduct, MappedSpecialOfferProductId> {

}
