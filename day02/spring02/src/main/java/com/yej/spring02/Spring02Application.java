package com.yej.spring02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);
		// 배열
		int[] score = {90,100,98, 83, 76};

		System.out.println(score[0]);

		score[4] = 80;
		System.out.println(score[4]);

		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		// 2번째 배열
		String[] carcompany = {"Hyundai", "Kia", "BMW", "Mercedes", "Tesla", "Benz"};

		List<String> car_list = Arrays.asList(carcompany);
		System.out.println(car_list);
		System.out.println(car_list.get(1));

		Arrays.sort(score);
		for(int item : score) {
			System.out.println(item);
		}

		Arrays.sort(carcompany, Collections.reverseOrder()); //내림차순 정렬
		for(String car : carcompany) {
			System.out.println(car);
		}

		
	}

}
