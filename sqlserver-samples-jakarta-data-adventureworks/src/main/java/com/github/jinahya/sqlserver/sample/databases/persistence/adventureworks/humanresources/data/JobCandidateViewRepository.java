package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.JobCandidateView;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

/**
 * A repository for {@link JobCandidateView}.
 */
@Repository
public interface JobCandidateViewRepository
        extends _Repository<JobCandidateView, Long>,
                CrudRepository<JobCandidateView, Long> {

}
