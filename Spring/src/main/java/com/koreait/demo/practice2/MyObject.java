package com.koreait.demo.practice2;

public class MyObject {
    private static MyObject instance;

    public static MyObject getInstance(){
        // 기존에 객체가 만들어지지 않았다면 새로운 객체를 만들어라
        if(instance == null){
            instance = new MyObject();
        }
        return instance;
    }

    private MyObject(){}
}
