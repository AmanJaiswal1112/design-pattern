package com.practice.creational.Abstract_Factory_Design_Pattern;

public class PublicUniversity implements UniversityFactory{
    @Override
    public AdmitCard getAdmitCard(String course) {
        switch(course){
            case "Math":
                return new MathAdmitCard();
            case "Physics":
                return new PhysicsAdmitCard();
            case "CS":
                return new CSAdmitCard();
        }
        return null;
    }

    @Override
    public FeeCalculator getFee(String course) {
        switch(course){
            case "Math":
                return new MathFeeCalculator();
            case "Physics":
                return new PhysicsFeeCalculator();
            case "CS":
                return new CSFeeCalculator();
        }
        return null;
    }
}
