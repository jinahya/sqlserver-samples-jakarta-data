package com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.data;

import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.data._Repository_IT;
import com.github.jinahya.sqlserver.sample.databases.persistence.adventureworks.humanresources.JobCandidateView;
import org.jboss.weld.junit5.auto.AddBeanClasses;

/**
 * The integration tests of {@link JobCandidateViewRepository}.
 */
@AddBeanClasses(JobCandidateViewRepository_.class)
class JobCandidateViewRepository_IT
        extends _Repository_IT<JobCandidateViewRepository, JobCandidateView, Long> {

    JobCandidateViewRepository_IT() {
        super(JobCandidateViewRepository.class, JobCandidateView.class, Long.class);
    }
}
