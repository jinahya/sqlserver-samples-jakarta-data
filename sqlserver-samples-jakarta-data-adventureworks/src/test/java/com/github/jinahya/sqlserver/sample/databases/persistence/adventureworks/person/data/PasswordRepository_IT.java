package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.person.Password;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PasswordRepository}.
 */
@AddBeanClasses(PasswordRepository_.class)
class PasswordRepository_IT
        extends _Repository_IT<PasswordRepository, Password, Integer> {

    PasswordRepository_IT() {
        super(PasswordRepository.class, Password.class, Integer.class);
    }
}
