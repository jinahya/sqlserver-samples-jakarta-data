package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.QualityInspection;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link QualityInspection}.
 */
@Repository
public interface QualityInspectionRepository
        extends _Repository<QualityInspection, Integer>,
                CrudRepository<QualityInspection, Integer> {

}
