package com.mfy.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = {"java.util","com.mfy.test.bean"})
@SpringBootApplication
public class SpringBootRunTest {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunTest.class,args);
	}
}
