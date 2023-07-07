package com.example.evchargingapp;

public class Charger {
    private int id;
    private String name;
    private String type;
    private String country;

    private int imgResource;

    public Charger(int id, String name, String type, String country, int imgResource) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.country = country;
        this.imgResource = imgResource;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
