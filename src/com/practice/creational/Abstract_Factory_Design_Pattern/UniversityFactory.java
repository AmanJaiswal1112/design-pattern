package com.practice.creational.Abstract_Factory_Design_Pattern;

public interface UniversityFactory {
    public static int cutOffScore = 109;

    public static UniversityFactory getUniversityFactory(int entranceScore){
        return cutOffScore>entranceScore ? new PrivateUniversity() : new PublicUniversity();

    }

    public AdmitCard getAdmitCard(String course);

    public FeeCalculator getFee(String course);


}
