package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SpecialOffer;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SpecialOfferRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SpecialOfferRepository}.
 */
@AddBeanClasses(SpecialOfferRepository_.class)
class SpecialOfferRepository_IT
        extends _Repository_IT<SpecialOfferRepository, SpecialOffer, Integer> {

    SpecialOfferRepository_IT() {
        super(SpecialOfferRepository.class, SpecialOffer.class, Integer.class);
    }
}
