package edu.javacourse.studentorder.domain;

public class Address {
    private  String street;
    private  String building;
    private  String extension;
    private  String apartment;
    private  String postCode;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getExtension() {
        return extension;
    }

    public String getApartment() {
        return apartment;
    }

    public String getPostCode() {
        return postCode;
    }
}
