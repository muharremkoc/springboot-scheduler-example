package com.example.springbootschedulerproject.tasks;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ScheduledTasks {
    private static final Logger logger=Logger.getLogger(ScheduledTasks.class);
   // @Scheduled(fixedRate = 2000)
    public void scheduleTaskWithFixedRate(){
        logger.info("Hello I'm FixedRate");

    };
   // @Scheduled(fixedDelay = 2000)
    public void scheduleTaskWithFixedDelay(){
        logger.info("HELLO,I'M FixedDelay");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            logger.error("Error is Finded",e);
            throw new IllegalStateException(e);
        }
    };
    //@Scheduled(fixedDelay = 2000,initialDelay = 5000)
    public void scheduleTaskWithInitialDelay(){
        logger.info("HELLO,I'M FixedDelayAndIniitialDelay");
    };
    //@Scheduled(cron = "0 * * * * ?")
    public void scheduleTaskWithCronExpression(){
        logger.info(Thread.currentThread().getName());
    };

    
}
