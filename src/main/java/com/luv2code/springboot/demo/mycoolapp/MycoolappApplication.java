package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
		System.err.println("this is a test");
		System.out.println("another edit");
	}

	public void testMethod() {
		System.out.println("test");
	}
	
	public void testMethod2() {
		System.out.println("test2 - new");
	}

}
