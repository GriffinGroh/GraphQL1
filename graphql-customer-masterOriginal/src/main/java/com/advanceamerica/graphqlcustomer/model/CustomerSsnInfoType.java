package com.advanceamerica.graphqlcustomer.model;

public class CustomerSsnInfoType {

    private String ssnEncrypted;

    private String ssnHash;

    private String ssnLast4;

    public String getSsnEncrypted() {
        return this.ssnEncrypted;
    }

    public void setSsnEncrypted(String value) {
        this.ssnEncrypted = value;
    }

    public String getSsnHash() {
        return this.ssnHash;
    }

    public void setSsnHash(String value) {
        this.ssnHash = value;
    }

    public String getSsnLast4() {
        return this.ssnLast4;
    }

    public void setSsnLast4(String value) {
        this.ssnLast4 = value;
    }
}