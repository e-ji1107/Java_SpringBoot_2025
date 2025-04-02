package com.yej.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring01Application.class, args);

		//while문 : 조건에 맞지 않으면 실행안됨
		int num = 10;

		while (num >= 10) {
			System.out.println(num);
			num--;
		}
		System.out.println("while문 종료");

		// do while문 : 조건에 맞지 않아도 한번은 실행해야함
		int cnt = 1;
		do{
			System.out.println(cnt);
			cnt++;
		}while(cnt < 1);
		System.out.println("do-while문 종료");

		num = 1;
		//break, continue
		while (num < 11) {
			if(num % 2==0){
				num++;
				break; // if 조건이 참일때 반복문 탈출
				//continue; // if 조건이 참이면 빠져나가서 다시 반복문으로 돌아감감
			}
			System.out.println(num);
			num++;
		}

		System.out.println("break, continue 종료");
		
	}

}
