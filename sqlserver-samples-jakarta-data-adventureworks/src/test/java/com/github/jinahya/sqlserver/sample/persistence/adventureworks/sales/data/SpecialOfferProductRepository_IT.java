package com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.mapped.sales.MappedSpecialOfferProductId;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.SpecialOfferProduct;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.sales.data.SpecialOfferProductRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SpecialOfferProductRepository}.
 */
@AddBeanClasses(SpecialOfferProductRepository_.class)
class SpecialOfferProductRepository_IT
        extends _Repository_IT<SpecialOfferProductRepository, SpecialOfferProduct, MappedSpecialOfferProductId> {

    SpecialOfferProductRepository_IT() {
        super(SpecialOfferProductRepository.class, SpecialOfferProduct.class, MappedSpecialOfferProductId.class);
    }
}
