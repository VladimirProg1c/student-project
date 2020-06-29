package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class Person {
    protected String surName;
    protected  String givenName;
    private  String patronymic;
    private LocalDate dateOfBirth;
    private Address address;

    public Person(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        this.surName = surName;
        this.givenName = givenName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public String getSurName() {
        return surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


}
