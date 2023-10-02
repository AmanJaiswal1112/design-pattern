package com.practice.creational.Builder_Design_Pattern;

public class BuilderDesignPAttern {
    public static void main(String[] args) {

        URL url = new URL();
        UrlBuilder.Builder urlBuilder = new UrlBuilder.Builder();
        UrlBuilder urlBuilder1 = urlBuilder
                .protocol("http")
                .host("localhost")
                .port(442)
                .build();

        System.out.println(urlBuilder1.protocol);
        System.out.println(urlBuilder1.host);
        System.out.println(urlBuilder1.port);


    }
}
