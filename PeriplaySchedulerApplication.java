package com.periplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PeriplaySchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeriplaySchedulerApplication.class, args);
	}

}
