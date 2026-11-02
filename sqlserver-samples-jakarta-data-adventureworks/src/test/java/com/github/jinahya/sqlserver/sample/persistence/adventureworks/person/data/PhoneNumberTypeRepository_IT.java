package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.PhoneNumberType;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data.PhoneNumberTypeRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PhoneNumberTypeRepository}.
 */
@AddBeanClasses(PhoneNumberTypeRepository_.class)
class PhoneNumberTypeRepository_IT
        extends _Repository_IT<PhoneNumberTypeRepository, PhoneNumberType, Integer> {

    PhoneNumberTypeRepository_IT() {
        super(PhoneNumberTypeRepository.class, PhoneNumberType.class, Integer.class);
    }
}
