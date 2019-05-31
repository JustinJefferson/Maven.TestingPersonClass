package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private Boolean isAlive;
    private String favoriteColor;
    private Boolean hasPet;
    private String job;
    private String residence;

    public Person() {

        name = "";
        age = Integer.MAX_VALUE;
        isAlive = false;
        favoriteColor = "";
        hasPet = false;
        job = "";
        residence = "";
    }

    public Person(int age) {

        this.age = age;
        name = "";
    }

    public Person(String name) {

        this.name = name;
        age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Boolean isAlive, String favoriteColor, Boolean hasPet, String job, String residence) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.favoriteColor = favoriteColor;
        this.hasPet = hasPet;
        this.job = job;
        this.residence = residence;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public Boolean getHasPet() {
        return hasPet;
    }

    public void setHasPet(Boolean hasPet) {
        this.hasPet = hasPet;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
