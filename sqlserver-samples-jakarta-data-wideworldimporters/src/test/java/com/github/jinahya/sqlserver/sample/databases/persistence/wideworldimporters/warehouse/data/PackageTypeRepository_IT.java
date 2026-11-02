package com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.wideworldimporters.warehouse.PackageType;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link PackageTypeRepository}.
 */
@AddBeanClasses(PackageTypeRepository_.class)
class PackageTypeRepository_IT
        extends _Repository_IT<PackageTypeRepository, PackageType, Integer> {

    PackageTypeRepository_IT() {
        super(PackageTypeRepository.class, PackageType.class, Integer.class);
    }
}
