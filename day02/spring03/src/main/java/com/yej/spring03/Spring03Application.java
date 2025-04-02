package com.yej.spring03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.yej.spring03.car;

@SpringBootApplication
public class Spring03Application {

	// 정적 메서드에서는 같은 클래스내 일반 메서드를 호출할 수 없음
	// 정적 메서드는 같은 클래스 내 정적 메서드만 호출할 수 있음
	// 다른 클래스는 상관 없음
	// 정적 메서드는 클래스 인스턴스 생성없이(new) 호출 가능
	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);
		//메서드

		sayHi();
		System.out.println("75는 짝수?" + isEven(75));

		//car 클래스 인스턴스 생성
		car car1 = new car(); //ctrl + space하고 car가 떠야함
		car1.name = "소나타";
		car1.year = 2023;
		
		car1.printCarName();
		car1.printCarName("흰색");
		car1.printCarName("소나타", "벤츠", "BMW", "아우디", "포르쉐", "람보르기니", "페라리");

		car.printYear();

		int term = car1.calcYear(2025);
		System.out.println("차량 연식 : " + term + "년");

	}

	public void printHello() {
		System.out.println("Hello");
	}

	public static void sayHi() {
		System.out.println("Hi");
	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}


