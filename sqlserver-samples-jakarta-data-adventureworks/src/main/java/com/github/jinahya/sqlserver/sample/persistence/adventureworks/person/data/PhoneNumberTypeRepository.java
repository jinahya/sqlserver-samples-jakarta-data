package com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.person.PhoneNumberType;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link PhoneNumberType}.
 */
@Repository
public interface PhoneNumberTypeRepository
        extends _Repository<PhoneNumberType, Integer>,
                CrudRepository<PhoneNumberType, Integer> {

}
