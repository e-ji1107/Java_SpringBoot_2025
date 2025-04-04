package com.yej.spring02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);
		int num = 10;
		float fnum = 10.0f;
		double dnum = 10.0;
		long lnum = 10L;

		Integer num2 = 10; // Integer는 객체형
		Float fnum2 = 10.0f; // Float는 객체형
		Double dnum2 = 10.0; // Double은 객체형
		Long lnum2 = 10L; // Long은 객체형


		// 제네릭 문자열 사용
		Storage<String> storage1 = new Storage<>();
		storage1.setItem("ionic");
		System.out.println(storage1.getItem());

		// 제네릭 정수사용
		Storage<Integer> storage2 = new Storage<>();
		storage2.setItem(2018);
		System.out.println(storage2.getItem());

		// 리턴타입 및 인자가 모두 제네릭일 때 처리
		Spring02Application app = new Spring02Application();
		System.out.println(app.convert(storage1));
	}
	// storage에 들어온 아이템을 문자로 분리해서 리스트에 담는 기능
	public <T> List<Character> convert(Storage<T> Storage){
		ArrayList<Character> list = new ArrayList<>();

		String s = String.valueOf(Storage.getItem());
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		return list;
	}
	
	public void print(Storage<?extends Storage> st){
		// 내용 생략
	} 
}


