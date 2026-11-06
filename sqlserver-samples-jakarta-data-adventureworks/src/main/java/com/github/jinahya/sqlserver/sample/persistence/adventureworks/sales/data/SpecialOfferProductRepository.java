package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.SpecialOfferProductId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SpecialOfferProduct;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SpecialOfferProduct}.
 */
@Repository
public interface SpecialOfferProductRepository
        extends _Repository<SpecialOfferProduct, SpecialOfferProductId>,
                CrudRepository<SpecialOfferProduct, SpecialOfferProductId> {

}
