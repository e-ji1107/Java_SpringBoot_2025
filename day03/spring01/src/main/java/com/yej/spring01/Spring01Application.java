package com.yej.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);
		// 인터페이스 연습
		Dog ppoppy = new Dog("뽀삐", 12);
		Cat nari = new Cat("나리", 3);

		ppoppy.introduce();
		ppoppy.cry();
		nari.introduce();
		nari.cry();
		
		// 인터페이스는 특이하게 사용하는 경우가 있음
		// 변수를 선언시 상위 인터페이스인 Aminal을 사용하면
		// 클래스를 변경해도 문제가 발생하지 않음
		// 스프링의 의존성 주입(Dependency Injection)에 핵심이 됨
		Animal choonsam = new Dog("춘삼이", 10);
		choonsam.cry();
		choonsam.introduce(); // Animal 인터페이스에 정의된 메서드 호출
		

	}

}
