package com.company;

public class Name {
    private String firstName;
    private String sureName;
    private String patronymic;

    public Name(String fullName){
        String[] tempArr = fullName.split(" ");
        sureName = tempArr[0];
        firstName = tempArr[1];
        patronymic = tempArr[2];
    }

    public Name(String firstName, String sureName, String patronymic){
        this.firstName = firstName;
        this.sureName = sureName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() { return firstName + " " + sureName + " " + patronymic; }
}
