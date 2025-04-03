package com.yej.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {


	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);
		// 문자열 메서드 연습
		String carstr = "Avanste, ionicm, x3";
		String[] cars = carstr.split(",");
		for(String car : cars){
			System.out.println(carstr.trim());
		}
		
		for (String car : cars){
			System.out.println(car.toUpperCase());

		}

		String caresult1 = carstr.replace(", ", "/");
		System.out.println(caresult1);
		String caresult2 = carstr.replaceAll(" ", "/");
		System.out.println(caresult2);

		char[] charList = carstr.toCharArray();
		for(char oneChar : charList){
			System.out.println(oneChar);
		}

		System.out.println(caresult1.indexOf("io"));
		System.out.println(caresult1.indexOf("io", 5));
		
	}

}
