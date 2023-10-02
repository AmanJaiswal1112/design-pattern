package com.practice.creational.Singlaton_Design_Pattern;

public class SinglatonPattern {
    private static volatile SinglatonPattern instance;

    private SinglatonPattern(){
        if(null != instance){
            throw new RuntimeException("Please don't use refleation api");
        }
    }
    public static SinglatonPattern getInstance() {
        if(null == instance)
            synchronized (SinglatonPattern.class){
                if(null == instance){
                    return instance = new SinglatonPattern();
                }
            }

        return instance;
    }
}
