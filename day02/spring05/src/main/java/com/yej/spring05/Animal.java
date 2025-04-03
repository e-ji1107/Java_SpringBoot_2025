package com.yej.spring05;

// 부모클래스 동물
public class Animal {
    //String name; dafault 접근제어자
    //public String name; public 접근제어자
    private String name; // private 접근제어자
    //protected String name; // protected 접근제어자
    int age; //동물 나이

    public int getAge() {
        return age;
    }

    // 정확한 캡슐화를 위해 필터링
    public void setAge(int age) {
        // 음수나 너무 큰 수가 들어주지 않도록 방어
    if (age <= 0) {
        this.age = 1;
    } else if (age > 20) {
        this.age = 20;
    }else {
        this.age = age;
    }

}
    void setName(String name) {
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void cry(){
        System.out.println(this.name + "이(가) 웁니다");
    }


}
