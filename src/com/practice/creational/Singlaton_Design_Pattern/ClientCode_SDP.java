package com.practice.creational.Singlaton_Design_Pattern;

public class ClientCode_SDP {
    public static void main(String[] args) {

        SinglatonPattern singlatonPattern = SinglatonPattern.getInstance();
        System.out.println(singlatonPattern);
        SinglatonPattern singlatonPattern1 = SinglatonPattern.getInstance();
        System.out.println(singlatonPattern1);


    }
}
