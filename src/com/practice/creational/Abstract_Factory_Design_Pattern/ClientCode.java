package com.practice.creational.Abstract_Factory_Design_Pattern;

public class ClientCode {
    public static void main(String args[]){
        int examScore = 215;
        UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversityFactory(examScore);
        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        System.out.println(admitCard.getClass());

        FeeCalculator feeCalculator = abstractUniversityFactory.getFee("Math");
        System.out.println(feeCalculator.calculateFee());
    }
}
