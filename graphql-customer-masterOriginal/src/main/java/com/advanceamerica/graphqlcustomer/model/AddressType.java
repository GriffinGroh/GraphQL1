package com.advanceamerica.graphqlcustomer.model;

public class AddressType {
	/*
	 * Holds data for employer address (a field in incomes)
	 */
	
	protected AddressTupleType addressType;
	protected String addressLine1;
	protected String addressLine2;
	protected String city;
	protected StateTupleType state;
	protected CountryTupleType countryType;
	protected String postalCode;
	protected String postalCodePlusFour;
	protected GeoCodeType geoCode;
	protected boolean verifiedFlag;
	protected VerifiedMethodTupleType verifiedMethod;
	protected String verifiedDateTime;
	
	public AddressTupleType getAddressType() {
		return addressType;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getCity() {
		return city;
	}
	public StateTupleType getState() {
		return state;
	}
	public CountryTupleType getCountryType() {
		return countryType;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getPostalCodePlusFour() {
		return postalCodePlusFour;
	}
	public GeoCodeType getGeoCode() {
		return geoCode;
	}
	public boolean getVerifiedFlag() {
		return verifiedFlag;
	}
	public VerifiedMethodTupleType getVerifiedMethod() {
		return verifiedMethod;
	}
	public String getVerifiedDateTime() {
		return verifiedDateTime;
	}
	public void setAddressType(AddressTupleType addressType) {
		this.addressType = addressType; 
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1; 
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(StateTupleType state) {
		this.state = state;
	}
	public void setCountryType(CountryTupleType countryType) {
		this.countryType = countryType; 
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode; 
	}
	public void setPostalCodePlusFour(String postalCodePlusFour) {
		this.postalCodePlusFour = postalCodePlusFour; 
	}
	public void setGeoCode(GeoCodeType geoCode) {
		this.geoCode = geoCode; 
	}
	public void setVerifiedFlag(boolean verifiedFlag) {
		this.verifiedFlag = verifiedFlag; 
	}
	public void setVerifiedMethod(VerifiedMethodTupleType verifiedMethod) {
		this.verifiedMethod = verifiedMethod; 
	}
	public void setVerifiedDateTime(String verifiedDateTime) {
		this.verifiedDateTime = verifiedDateTime;
	}
}