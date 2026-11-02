package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.Color;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ColorRepository}.
 */
@AddBeanClasses(ColorRepository_.class)
class ColorRepository_IT
        extends _Repository_IT<ColorRepository, Color, Integer> {

    ColorRepository_IT() {
        super(ColorRepository.class, Color.class, Integer.class);
    }
}
