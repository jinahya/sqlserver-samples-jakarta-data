package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SpecialOffer;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SpecialOffer}.
 */
@Repository
public interface SpecialOfferRepository
        extends _Repository<SpecialOffer, Integer>,
                CrudRepository<SpecialOffer, Integer> {

}
