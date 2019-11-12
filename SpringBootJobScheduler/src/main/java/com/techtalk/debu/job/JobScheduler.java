package com.techtalk.debu.job;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.techtalk.debu.service.SumService;

@Component
public class JobScheduler {

	private static final Logger LOGGER = LoggerFactory.getLogger(JobScheduler.class);

	@Autowired
	private SumService sumService;

	//@Scheduled(cron = "0 0/2 * * * ?")  // run the job every two minutes
	@Scheduled(cron = "0 0/1 * * * ?")  // run the job every one minutes
	public void createActivity() {
		// Your Repeatedly work call put in this method
		LOGGER.info("Scheduled task execution starting ... ");
		Random random = new Random();
		int output =  sumService.sum(random.nextInt(), random.nextInt(), random.nextInt());
		System.out.println("Sumation is :: " + output);
		LOGGER.info("Scheduled task executed successfully ... ");

	}

}
