package com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.JobCandidate;
import com.github.jinahya.sqlserver.sample.persistence.adventureworks.humanresources.data.JobCandidateRepository;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link JobCandidateRepository}.
 */
@AddBeanClasses(JobCandidateRepository_.class)
class JobCandidateRepository_IT
        extends _Repository_IT<JobCandidateRepository, JobCandidate, Long> {

    JobCandidateRepository_IT() {
        super(JobCandidateRepository.class, JobCandidate.class, Long.class);
    }
}
