package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.QualityInspection;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data.QualityInspectionRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link QualityInspectionRepository}.
 */
@AddBeanClasses(QualityInspectionRepository_.class)
class QualityInspectionRepository_IT
        extends _Repository_IT<QualityInspectionRepository, QualityInspection, Integer> {

    QualityInspectionRepository_IT() {
        super(QualityInspectionRepository.class, QualityInspection.class, Integer.class);
    }
}
