package com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.data;

import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.data._Repository;
import com.github.jinahya.sqlserver.sample.persistence.futonmanufacturing.dbo.SalesReturnsAnalysisView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link SalesReturnsAnalysisView}.
 */
@Repository
public interface SalesReturnsAnalysisViewRepository
        extends _Repository<SalesReturnsAnalysisView, Integer>,
                CrudRepository<SalesReturnsAnalysisView, Integer> {

}
