package com.practice.structural.Facade_Design_pattern;

public class UserBuilder {



    public static class Builder{
        private int id;
        private String name;
        private String email;
        private int phn;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder email(String email){
            this.email = email;
            return this;
        }
        public Builder phn(int phn){
            this.phn = phn;
            return this;
        }

        public UserBuilder build(){
            return new UserBuilder(this);
        }

    }

    public int id;
    public String name;
    public String email;
    public int phn;

    public UserBuilder(Builder builder) {
        this.email=builder.email;
        this.id=builder.id;
        this.name = builder.name;
        this.phn= builder.phn;
    }
}
