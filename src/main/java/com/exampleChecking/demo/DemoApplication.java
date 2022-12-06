package com.exampleChecking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		AccountManagement accountManagement = new AccountManagement(System.out, new LineReader(System.in));
		accountManagement.submit();
//		accountManagement.viewBalance();
	}
}
