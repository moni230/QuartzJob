package org.example.quartzjob.Config;

import org.example.quartzjob.Job.PostFetchJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail getJobDetail() {
        JobDetail jobDetail = JobBuilder.newJob(PostFetchJob.class)
                .withIdentity("postfetchjob")
                .storeDurably()
                .build();
        return jobDetail;
    }

    @Bean
    public Trigger triggerJob(JobDetail job) {
        Trigger trigger =  TriggerBuilder.newTrigger()
                .withIdentity("triggerjob")
                .forJob(job)
                .startNow()
                .withSchedule(SimpleScheduleBuilder
                        .simpleSchedule()
                        .withIntervalInSeconds(5)
                        .withRepeatCount(19))
                        .build();
           return trigger;
    }
} 