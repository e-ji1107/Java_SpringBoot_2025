package com.yej.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);
		// 예외처리
		int result = 0;
		try{
			result = 17/0;
		} catch (ArithmeticException e){
			System.out.println(e);
		} 

		String[] names = {"홍길동", "이순신", "강감찬"};
		try{
			System.out.println(names[3]); // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		} finally {
			System.out.println("finally 블록 실행!"); // finally 블록은 항상 실행됨
		}
		
		// 예외클래스
		String name = null;
		try{
		String[] names2 = name.split(" ");
		System.out.println(names2[0]);
		} catch (NullPointerException e){
			System.out.println(e.getMessage()); //e보다는 e.getMessage()를 사용하는 것이 좋음
		}

		Spring02Application app = new Spring02Application();
		try{
			app.sayNi
		}



		System.out.println("프로그램 종료!"); // 정상적으로 프로그램 종료
	}

}
