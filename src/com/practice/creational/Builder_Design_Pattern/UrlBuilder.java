package com.practice.creational.Builder_Design_Pattern;

public class UrlBuilder {

    public static class Builder{
        private String host;
        private String protocol;
        private int port;
        private String pathParam;
        private String queryParam;

        public UrlBuilder build(){
            return new UrlBuilder(this);
        }

        public Builder host(String host){
            this.host = host;
            return this;
        }
        public Builder protocol(String protocol){
            this.protocol = protocol;
            return this;
        }
        public Builder pathParam(String pathParam){
            this.pathParam = pathParam;
            return this;
        }
        public Builder queryParam(String queryParam){
            this.queryParam = queryParam;
            return this;
        }

        public Builder port(int port){
            this.port = port;
            return this;
        }
    }

    public String host;
    public String protocol;
    public int port;
    public String pathParam;
    public String queryParam;

        public UrlBuilder(Builder builder){
            this.host = builder.host;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.queryParam = builder.queryParam;;
            this.pathParam = builder.pathParam;
        }
}
