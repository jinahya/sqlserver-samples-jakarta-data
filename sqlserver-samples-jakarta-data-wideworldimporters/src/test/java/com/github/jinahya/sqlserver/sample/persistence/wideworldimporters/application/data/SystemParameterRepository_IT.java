package com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data;

import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.SystemParameter;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.wideworldimporters.application.data.SystemParameterRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link SystemParameterRepository}.
 */
@AddBeanClasses(SystemParameterRepository_.class)
class SystemParameterRepository_IT
        extends _Repository_IT<SystemParameterRepository, SystemParameter, Integer> {

    SystemParameterRepository_IT() {
        super(SystemParameterRepository.class, SystemParameter.class, Integer.class);
    }
}
