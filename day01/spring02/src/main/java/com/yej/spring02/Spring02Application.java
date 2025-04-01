package com.yej.spring02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner; //콘솔 입력받을 클래스 선언언

@SpringBootApplication
public class Spring02Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring02Application.class, args);

		Scanner scan = new Scanner(System.in); //콘솔 입력받을 객체 생성
		System.out.print("아이디 입력 >>");
		String id = scan.next(); //콘솔 입력받기
		System.out.println("비밀번호 입력 >>");
		String pw = scan.next(); //콘솔 입력받기
		System.out.println("입력아이디-->" + id);
		System.out.println("입력비밀번호-->" + pw);

		if (id == "yej1107" && pw == "1234") { //아이디와 비밀번호가 같으면
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

		switch (pw){
			case "1234" :
				System.out.println("비밀번호가 1234입니다.");
				break;
			case "12":
				System.out.println("패스워드 오류");
				break;
			default:
				System.out.println("비밀번호 전체오류");
				break;
		}
	// 3항 연산 연습
	String result = (pw.equals("1234")) ? "메인화면진입" : "비밀번호가 다릅니다.";
	System.out.println("다음화면>>"+result);
	}

}
