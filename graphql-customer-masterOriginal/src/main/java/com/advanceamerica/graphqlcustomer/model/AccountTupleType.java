package com.advanceamerica.graphqlcustomer.model;

public class AccountTupleType {
	protected String code; //AccountTupleCodeType
	protected String description; //TupleDescriptionType
	
	public String getCode() {
		return code;
	}
	public String getDesription() {
		return description;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
