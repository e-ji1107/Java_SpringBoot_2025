package com.yej.spring05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring05Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring05Application.class, args);

		//상속
		Dog ppoppy = new Dog();
		ppoppy.setName("뽀삐");
		ppoppy.cry();
		ppoppy.setAge(450);
		System.out.println(ppoppy.getName() + "의 나이는 " + ppoppy.getAge() + "살입니다");

		Cat kitty = new Cat();
		kitty.setName("키티");
		kitty.cry();
		kitty.setAge(12);
		System.out.println(kitty.getName() + "의 나이는 " + kitty.getAge() + "살입니다");

		Dog choonsam = new Dog();
		choonsam.setName("춘삼이");
		choonsam.cry();
		System.out.println(choonsam.getClassName().getSimpleName());// Object 클래서 메서드로 사용 가능


	}

}
