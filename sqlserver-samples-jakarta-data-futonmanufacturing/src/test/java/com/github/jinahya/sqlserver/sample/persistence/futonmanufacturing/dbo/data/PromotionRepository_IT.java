package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.Promotion;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.PromotionRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PromotionRepository}.
 */
@AddBeanClasses(PromotionRepository_.class)
class PromotionRepository_IT
        extends _Repository_IT<PromotionRepository, Promotion, Integer> {

    PromotionRepository_IT() {
        super(PromotionRepository.class, Promotion.class, Integer.class);
    }
}
