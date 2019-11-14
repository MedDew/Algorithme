package com.meddew.algo.constructor;

public class TestConstructorPrivate {
    private static TestConstructorPrivate testConstructorPrivate;
    private TestConstructorPrivate() {
        System.out.println("Constructeur privé");
    }

    public static TestConstructorPrivate getInstance(){
        if(testConstructorPrivate == null){
            testConstructorPrivate = new TestConstructorPrivate();
        }
        return testConstructorPrivate;
    }
}
