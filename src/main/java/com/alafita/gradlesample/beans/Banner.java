package com.alafita.gradlesample.beans;


public class Banner {

    String url;
    String name;
    Boolean active;

    public Banner() {
    }

    public Banner(String url, String name, Boolean active) {
        this.url = url;
        this.name = name;
        this.active = active;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setActive(Boolean active){
        this.active = active;
    }

    public Boolean getActive() {
        return this.active;
    }
}
