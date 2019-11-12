# Spring-Boot-Job-Scheduler
# @Scheduled -SPring Micro Service Jon
This is Job Scheduler Project by Using Spring Boot and Graddle
# To Understand the @Schedule annotation check below Youtube Video
# https://youtu.be/dQfxVVx0IzQ


#Job #Scheduler #@Scheduled #Spring #App #Micro-Service

if you are planning to schedule a particular task which need to be executed in frequent interval then this is the best way :
1. Create your Scheduler class: like below 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledTaskOrJob {
 
 @Autowired
 YourServiceClass yourServiceClass ; // if needed

 @Scheduled(fixedRate = 60000) // 1 mins - represent in mili seconds
  public void scheduleJob() {
  // Your Task should be put in this method
 }
 }
// If you want to enable it in SpringBoot Application then annote your main app class with @EnableScheduling annotation.

if you like my video, please subscribe to my channel and share the video.
Follow me on FaceBook: https://www.facebook.com/TechTalkDebu
Github Code Link: https://github.com/admindebu
Instagram: techtalk_debu
and LinkedIn: https://www.linkedin.com/in/debu-paul

Thanks & Regards,
Debu Paul
