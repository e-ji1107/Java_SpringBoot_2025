package com.yej.spring02;

public class Storage <P>{
    private P item;
    // ctrl + . = getter, setter 자동 생성

    public P getItem() {
        return item;
    }

    public void setItem(P item) {
        this.item = item;
    }


}
