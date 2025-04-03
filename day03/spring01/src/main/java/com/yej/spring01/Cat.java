package com.yej.spring01;

public class Cat implements Animal {
    private String name;
    private int age;

    Cat(String name, int age){
        this.name = name;
        this.age = age;

    }

    //이제부터 오버라이딩
    @Override
    public void cry() {
        //throw new UnsupportedOperationException()
        System.out.println(this.name + "이(가) 웁니다. 냥");

    }

}
