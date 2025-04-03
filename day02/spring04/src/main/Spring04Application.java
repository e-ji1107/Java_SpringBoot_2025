package com.yej.spring04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yej.NewCar;

@SpringBootApplication
public class Spring04Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring04Application.class, args);

		//클래스 사용
		NewCar avante = new NewCar("avante", "현대자동차", "white", 2016);
		NewCar peugeot = new NewCar("peugeot", "푸조", "black", 2018);
		avante.doAccelerate();
		avante.doBrake();
		avante.changeGear();
		avante.turnLeft();
		avante.turnRight();
		peugeot.doAccelerate();
		peugeot.doBrake();
		peugeot.changeGear();
		peugeot.turnLeft();
		peugeot.turnRight();

		System.out.println(peugeot);
		System.out.println(avante);
		

		

	}

}
