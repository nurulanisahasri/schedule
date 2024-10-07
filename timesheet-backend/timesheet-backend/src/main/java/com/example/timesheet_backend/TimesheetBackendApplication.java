package com.example.timesheet_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "entity")
public class TimesheetBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimesheetBackendApplication.class, args);
	}

}
