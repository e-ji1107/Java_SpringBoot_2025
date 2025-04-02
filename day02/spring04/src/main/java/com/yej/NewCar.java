package com.yej;

public class NewCar {
    //멤버변수/속성
    String model_name;
    String company = "현대자동차";
    String color = "white";
    int release_year;
    String fuel_type = "휘발유";

    // 생성자(클래스명과 일치)
    NewCar(String model_name, int release_year) {
        model_name = "아반테";
        this.company = "현대자동차";
    }

    // 메서드오버로딩
    public NewCar(String model_name, String company, String color, int release_year) {
        this.model_name = model_name;
        this.company = company;
        this.color = color;
        this.release_year = release_year;
        System.out.println("자동차 생성자 호출됨");
    }

    // 멤버메서드
    public void doAccelerate() {
        System.out.println("가속");
    }
    public void doBrake() {
        System.out.println("정지");
    }
    public void changeGear() {
        System.out.println("기어변속");
    }
    public void turnLeft() {
        System.out.println("좌회전");
    }
    public void turnRight() {
        System.out.println("우회전");
    }

}
