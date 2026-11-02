package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.Shift;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.ShiftRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ShiftRepository}.
 */
@AddBeanClasses(ShiftRepository_.class)
class ShiftRepository_IT
        extends _Repository_IT<ShiftRepository, Shift, Long> {

    ShiftRepository_IT() {
        super(ShiftRepository.class, Shift.class, Long.class);
    }
}
