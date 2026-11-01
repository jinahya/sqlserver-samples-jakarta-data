package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.Shift;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link ShiftRepository}.
 */
@AddBeanClasses(ShiftRepository_.class)
class ShiftRepository_IT
        extends _Repository_IT<ShiftRepository, Shift, Short> {

    ShiftRepository_IT() {
        super(ShiftRepository.class, Shift.class, Short.class);
    }
}
