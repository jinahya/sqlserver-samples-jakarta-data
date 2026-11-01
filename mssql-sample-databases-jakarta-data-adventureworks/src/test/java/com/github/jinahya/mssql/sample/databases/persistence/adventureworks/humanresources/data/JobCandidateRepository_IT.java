package com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.mssql.sample.databases.persistence.adventureworks.humanresources.JobCandidate;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link JobCandidateRepository}.
 */
@AddBeanClasses(JobCandidateRepository_.class)
class JobCandidateRepository_IT
        extends _Repository_IT<JobCandidateRepository, JobCandidate, Integer> {

    JobCandidateRepository_IT() {
        super(JobCandidateRepository.class, JobCandidate.class, Integer.class);
    }
}
