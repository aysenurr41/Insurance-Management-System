package com.anadolubankproject.insurancemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anadolubankproject.insurancemanagement.console_answer.Begin;

@SpringBootApplication
public class InsuranceManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(InsuranceManagementApplication.class, args);
		Begin.inprocess();
	}

}
