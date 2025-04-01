package com.yej.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
		System.out.println("Spring Boot application started successfully!");

		//변수 연습
		int account = 1000000;
		System.out.println("계좌 잔고: " + account);
		float pi = 3.141503f;
		System.out.println("원주율: " + pi);
		char char_first = 'A';
		System.out.println("문자는 " + char_first);

		// 연산자 연습
		int a = 17;
		int b = 24;
		System.out.printf("a + b = %\n", a+b);
		int divresult = b % a;
		System.out.printf("b / a = %d\n", divresult);

	
	}

}
