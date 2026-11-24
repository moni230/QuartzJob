package org.example.quartzjob.Job;

import org.example.quartzjob.Service.PostService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class PostFetchJob extends QuartzJobBean {

    @Autowired
    PostService service;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {

        service.saveNextBatch();
        }
    }
