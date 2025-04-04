package com.yej.spring04;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring04Application {
	public interface myMax { // 익명 함수를 위한 인터페이스
		int max(int a, int b);
		
	}
	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		//람다식
		// 1. 일반 방식
		Spring04Application app = new Spring04Application();
		System.out.println(app.helloJava());

		// 2. 람다방식
		myFuncInterface fi = () -> { System.out.println("hello java"); };
		fi.printHello();

		myCalc calc = (x, y) ->{return x + y;};
		int result = calc.plus(10, 20);
		System.out.println(result);

		List<String> avengers = Arrays.asList("ironman", "hulk", "thor", "spiderman");

		//정렬
		Collections.sort(avengers);
		System.out.println(avengers);

		for(String avenger : avengers) {
			System.out.println(avenger);
		}
		// 단점은 출력시 반목문 사용, 정렬 후 원본 순서가 달라짐.

		//2. 스트림 API 사용 방식
		avengers = Arrays.asList("ironman", "hulk", "thor", "spiderman");
		Stream<String> stream = avengers.stream();
		System.out.println(avengers);
	}

	public String helloJava(){
		return "hello java";
	}

	@FunctionalInterface // 함수형 인터페이스로 지칭
	public interface myFuncInterface {
		void printHello();
	}

}
