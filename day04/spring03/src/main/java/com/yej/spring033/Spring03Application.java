package com.yej.spring033;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring03Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);

		// 컬렉션 프레임워크
		// List

		List<String> lst1 = new ArrayList<>();

		lst1.add("one");
		lst1.add("two");
		lst1.add("three");
		lst1.add("four");


		System.out.println(lst1);

		List<String> lst2 = new ArrayList<>();
		lst2.add("Five");
		lst2.add("Six");

		lst1.addAll(lst2);
		lst1.set(0, "zero");

		List<Integer> lst3 = new LinkedList<>();
		lst3.add(10);
		lst3.add(20);
		lst3.add(30);
		System.out.println(lst3);

		// 정렬
		System.out.println(lst1);
		System.out.println(lst1);
	
		Collections.sort(lst1, Collections.reverseOrder());
		System.out.println(lst1);
		// lst1.sort 이 정렬 메서드 사용해도 무방

		System.out.println(lst1.contains("three"));
		System.out.println(lst1.isEmpty());
		System.out.println(lst1.size());
		lst1.remove(5);
		System.out.println(lst1);
		
		// ! 중요한 메서드
		// lst1.clear(); // 로직 중간에 함부로 쓰지말것. 프로그램 종료시 리스트를 비우는것

		// vector - ArrayList와 거의 동일
		Vector<String> vec1 = new Vector<>(10);// 용량 지정 가능
		vec1.add("one");
		vec1.add("two");
		System.out.println("벡터 크기" + vec1.size());
		System.out.println("벡터 용량" + vec1.capacity());



		//set
		Set<String> set1 = new HashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("one"); // 중복된 값은 추가되지 않음
		set1.add("five");
		set1.add("six");
		System.out.println(set1);

		System.out.println(set1.contains("three"));
		System.out.println(set1.isEmpty());
		System.out.println(set1.size());
		set1.remove(5);
		set1.removeAll(set1); // 모두 지움
		set1.add("five");
		System.out.println(set1);

		// Map
		Map<String, String> phones = new java.util.HashMap<>();
		phones.put("010-9999-8888", "Galaxy S10");
		phones.put("010-8888-7777", "IPhone 12");
		phones.put("010-7777-6666", "Galaxy S21");
		phones.put("010-6666-5555", "IPhone 13");

		System.out.println(phones);
		System.out.println(phones.get("010-9999-8887"));

		// 샘플 - 학생 4명의 국어, 영어, 수학, 미술, 체육 점수 합산하고 평균내기
		List<Integer> std1 = Arrays.asList(96,100,55,80,70);
		List<Integer> std2 = Arrays.asList(96,100,99,80,70);
		List<Integer> std3 = Arrays.asList(50,100,55,80,70);
		List<Integer> std4 = Arrays.asList(96,100,55,80,70);

		Map<String, List<Integer>> students = new HashMap();
		students.put("홍길동", std1);
		students.put("이순신", std2);
		students.put("강감찬", std3);
		students.put("유관순", std4);

		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 학생 이름을 입력하세요");
		String name = sc.nextLine();

		int sum = 0;
		for(int score : students.get(name)) {
			sum += score;
		}

		System.out.println(name + "의 총점은 " + sum + "입니다.");



	}



}
