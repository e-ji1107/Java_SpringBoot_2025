package com.yej.spring01;

//interface는 implements 키워드 사용해야함
public class Dog implements Animal {
    private String name;
    private int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;

    }

    //이제부터 오버라이딩
    @Override
    public void cry() {
        //throw new UnsupportedOperationException()
        System.out.println(this.name + "이(가) 웁니다. 멍멍");

    }

    public void introduce(){
        System.out.println("저는 강아지에요");
    }

}
