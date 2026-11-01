package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.JobCandidate;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link JobCandidate}.
 */
@Repository
public interface JobCandidateRepository
        extends _Repository<JobCandidate, Integer>,
                CrudRepository<JobCandidate, Integer> {

}
