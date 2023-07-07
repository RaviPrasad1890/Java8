package com.java.educative.roughwork;

public class Player {

    private int id;
    private String name;
    private String country;
    private int point;

    public Player(int id, String name, String country, int point) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.point = point;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", point='" + point + '\'' +
                '}';
    }
}
