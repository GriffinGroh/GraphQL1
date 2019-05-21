package com.advanceamerica.graphqlcustomer.model;

public class PersonType {

    private String title;

    private String firstName;

    private String middleName;

    private String middleInitial;

    private String lastName;

    private String lastName2;

    private String previousLastName;

    private String preferred;

    private String fullName;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String value) {
        this.middleName = value;
    }

    public String getMiddleInitial() {
        return this.middleInitial;
    }

    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getLastName2() {
        return this.lastName2;
    }

    public void setLastName2(String value) {
        this.lastName2 = value;
    }

    public String getPreviousLastName() {
        return this.previousLastName;
    }

    public void setPreviousLastName(String value) {
        this.previousLastName = value;
    }

    public String getPreferred() {
        return this.preferred;
    }

    public void setPreferred(String value) {
        this.preferred = value;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String value) {
        this.fullName = value;
    }

}