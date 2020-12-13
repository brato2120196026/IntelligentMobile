package com.example.patientinformationapp;

import java.io.Serializable;

public class UserModel implements Serializable {
    private String name, address, age, sex, contact, city;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public UserModel(String name, String address, String city, String sex, int id, String age,String contact) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.sex = sex;
        this.id = id;
        this.age = age;
        this.contact = contact;
    }

    public UserModel() {
    }
}
