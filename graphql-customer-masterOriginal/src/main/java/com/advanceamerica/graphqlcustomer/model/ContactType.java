package com.advanceamerica.graphqlcustomer.model;

public class ContactType {

	private String seqNumber;

	private ContactTupleType contactType;

	private String addr;

	private String contactNumber;

	private String macAddr;

	private String ipAddr;

	private CountryTupleType phoneCountry;

	private String phoneNumber10Digit;

	private String preferredFlag;

	private String activeFlag;

	private String activeDateTime;

	private String canContactFlag;

	private String canContactDateTime;

	private String canMarketFlag;

	private String canMarketDateTime;

	private String allowAcctMaintenanceFlag;

	private String allowAcctMaintenanceDateTime;

	private String optInReferenceId;

	public String getSeqNumber() {
		return seqNumber;
	}

	public void setSeqNumber(String seqNumber) {
		this.seqNumber = seqNumber;
	}

	public ContactTupleType getContactType() {
		return contactType;
	}

	public void setContactType(ContactTupleType contactType) {
		this.contactType = contactType;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMacAddr() {
		return macAddr;
	}

	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public CountryTupleType getPhoneCountry() {
		return phoneCountry;
	}

	public void setPhoneCountry(CountryTupleType phoneCountry) {
		this.phoneCountry = phoneCountry;
	}

	public String getPhoneNumber10Digit() {
		return phoneNumber10Digit;
	}

	public void setPhoneNumber10Digit(String phoneNumber10Digit) {
		this.phoneNumber10Digit = phoneNumber10Digit;
	}

	public String getPreferredFlag() {
		return preferredFlag;
	}

	public void setPreferredFlag(String preferredFlag) {
		this.preferredFlag = preferredFlag;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getActiveDateTime() {
		return activeDateTime;
	}

	public void setActiveDateTime(String activeDateTime) {
		this.activeDateTime = activeDateTime;
	}

	public String getCanContactFlag() {
		return canContactFlag;
	}

	public void setCanContactFlag(String canContactFlag) {
		this.canContactFlag = canContactFlag;
	}

	public String getCanContactDateTime() {
		return canContactDateTime;
	}

	public void setCanContactDateTime(String canContactDateTime) {
		this.canContactDateTime = canContactDateTime;
	}

	public String getCanMarketFlag() {
		return canMarketFlag;
	}

	public void setCanMarketFlag(String canMarketFlag) {
		this.canMarketFlag = canMarketFlag;
	}

	public String getCanMarketDateTime() {
		return canMarketDateTime;
	}

	public void setCanMarketDateTime(String canMarketDateTime) {
		this.canMarketDateTime = canMarketDateTime;
	}

	public String getAllowAcctMaintenanceFlag() {
		return allowAcctMaintenanceFlag;
	}

	public void setAllowAcctMaintenanceFlag(String allowAcctMaintenanceFlag) {
		this.allowAcctMaintenanceFlag = allowAcctMaintenanceFlag;
	}

	public String getAllowAcctMaintenanceDateTime() {
		return allowAcctMaintenanceDateTime;
	}

	public void setAllowAcctMaintenanceDateTime(String allowAcctMaintenanceDateTime) {
		this.allowAcctMaintenanceDateTime = allowAcctMaintenanceDateTime;
	}

	public String getOptInReferenceId() {
		return optInReferenceId;
	}

	public void setOptInReferenceId(String optInReferenceId) {
		this.optInReferenceId = optInReferenceId;
	}
}
