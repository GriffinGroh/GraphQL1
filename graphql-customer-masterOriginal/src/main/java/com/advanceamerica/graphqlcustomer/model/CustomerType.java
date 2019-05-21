package com.advanceamerica.graphqlcustomer.model;

public class CustomerType {

    private String customerId;

    private String sourceSystemCd;
  
    private PersonType customerName;
    
    private CustomerStatusTupleType customerStatusType;

    private String dob;
    
    private StateTupleType state;
    
    private TimeZoneTupleType timeZone;
    
    private Integer centerNumber;
    
    private String omniCustomerId;
   
    private String omniMasterRecordFlag;
  
    private String omniRecordLockFlag;
    
    private String firstCreated;
    
    private String lastUpdated;
   
    private String applicationDateTime;
    
    private String canShareDataCode;
    
    private String canShareDataDate;
   
    private String canMarketFlag;
    
    private String canMarketDate;
    
    private String canContactFlag;
    
    private String canContactDate;
   
    private ContactMethodTupleType lastContactMethodCode;
   
    private String lastContactDate;
    
    private String reviewNeededFlag;
    
    private String reviewLastDateTime;
    
    private LanguageTupleType language;

    private CustomerSsnInfoType ssnInfo;

    private CustomerAddressCollectionType addresses;
    
    private ContactCollectionType contacts;

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }    

    /**
     * @return the customerName
     */
    public PersonType getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(PersonType customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerStatusType
     */
    public CustomerStatusTupleType getCustomerStatusType() {
        return customerStatusType;
    }

    /**
     * @param customerStatusType the customerStatusType to set
     */
    public void setCustomerStatusType(CustomerStatusTupleType customerStatusType) {
        this.customerStatusType = customerStatusType;
    }

    /**
     * @return the state
     */
    public StateTupleType getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(StateTupleType state) {
        this.state = state;
    }

    /**
     * @return the timeZone
     */
    public TimeZoneTupleType getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone the timeZone to set
     */
    public void setTimeZone(TimeZoneTupleType timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return the centerNumber
     */
    public Integer getCenterNumber() {
        return centerNumber;
    }

    /**
     * @param centerNumber the centerNumber to set
     */
    public void setCenterNumber(Integer centerNumber) {
        this.centerNumber = centerNumber;
    }

    /**
     * @return the omniCustomerId
     */
    public String getOmniCustomerId() {
        return omniCustomerId;
    }

    /**
     * @param omniCustomerId the omniCustomerId to set
     */
    public void setOmniCustomerId(String omniCustomerId) {
        this.omniCustomerId = omniCustomerId;
    }

    /**
     * @return the omniMasterRecordFlag
     */
    public String getOmniMasterRecordFlag() {
        return omniMasterRecordFlag;
    }

    /**
     * @param omniMasterRecordFlag the omniMasterRecordFlag to set
     */
    public void setOmniMasterRecordFlag(String omniMasterRecordFlag) {
        this.omniMasterRecordFlag = omniMasterRecordFlag;
    }

    /**
     * @return the omniRecordLockFlag
     */
    public String getOmniRecordLockFlag() {
        return omniRecordLockFlag;
    }

    /**
     * @param omniRecordLockFlag the omniRecordLockFlag to set
     */
    public void setOmniRecordLockFlag(String omniRecordLockFlag) {
        this.omniRecordLockFlag = omniRecordLockFlag;
    }

    /**
     * @return the firstCreated
     */
    public String getFirstCreated() {
        return firstCreated;
    }

    /**
     * @param firstCreated the firstCreated to set
     */
    public void setFirstCreated(String firstCreated) {
        this.firstCreated = firstCreated;
    }

    /**
     * @return the lastUpdated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * @param lastUpdated the lastUpdated to set
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * @return the applicationDateTime
     */
    public String getApplicationDateTime() {
        return applicationDateTime;
    }

    /**
     * @param applicationDateTime the applicationDateTime to set
     */
    public void setApplicationDateTime(String applicationDateTime) {
        this.applicationDateTime = applicationDateTime;
    }

    /**
     * @return the canShareDataCode
     */
    public String getCanShareDataCode() {
        return canShareDataCode;
    }

    /**
     * @param canShareDataCode the canShareDataCode to set
     */
    public void setCanShareDataCode(String canShareDataCode) {
        this.canShareDataCode = canShareDataCode;
    }

    /**
     * @return the canShareDataDate
     */
    public String getCanShareDataDate() {
        return canShareDataDate;
    }

    /**
     * @param canShareDataDate the canShareDataDate to set
     */
    public void setCanShareDataDate(String canShareDataDate) {
        this.canShareDataDate = canShareDataDate;
    }

    /**
     * @return the canMarketFlag
     */
    public String getCanMarketFlag() {
        return canMarketFlag;
    }

    /**
     * @param canMarketFlag the canMarketFlag to set
     */
    public void setCanMarketFlag(String canMarketFlag) {
        this.canMarketFlag = canMarketFlag;
    }

    /**
     * @return the canMarketDate
     */
    public String getCanMarketDate() {
        return canMarketDate;
    }

    /**
     * @param canMarketDate the canMarketDate to set
     */
    public void setCanMarketDate(String canMarketDate) {
        this.canMarketDate = canMarketDate;
    }

    /**
     * @return the canContactFlag
     */
    public String getCanContactFlag() {
        return canContactFlag;
    }

    /**
     * @param canContactFlag the canContactFlag to set
     */
    public void setCanContactFlag(String canContactFlag) {
        this.canContactFlag = canContactFlag;
    }

    /**
     * @return the canContactDate
     */
    public String getCanContactDate() {
        return canContactDate;
    }

    /**
     * @param canContactDate the canContactDate to set
     */
    public void setCanContactDate(String canContactDate) {
        this.canContactDate = canContactDate;
    }

    /**
     * @return the lastContactMethodCode
     */
    public ContactMethodTupleType getLastContactMethodCode() {
        return lastContactMethodCode;
    }

    /**
     * @param lastContactMethodCode the lastContactMethodCode to set
     */
    public void setLastContactMethodCode(ContactMethodTupleType lastContactMethodCode) {
        this.lastContactMethodCode = lastContactMethodCode;
    }

    /**
     * @return the lastContactDate
     */
    public String getLastContactDate() {
        return lastContactDate;
    }

    /**
     * @param lastContactDate the lastContactDate to set
     */
    public void setLastContactDate(String lastContactDate) {
        this.lastContactDate = lastContactDate;
    }

    /**
     * @return the reviewNeededFlag
     */
    public String getReviewNeededFlag() {
        return reviewNeededFlag;
    }

    /**
     * @param reviewNeededFlag the reviewNeededFlag to set
     */
    public void setReviewNeededFlag(String reviewNeededFlag) {
        this.reviewNeededFlag = reviewNeededFlag;
    }

    /**
     * @return the reviewLastDateTime
     */
    public String getReviewLastDateTime() {
        return reviewLastDateTime;
    }

    /**
     * @param reviewLastDateTime the reviewLastDateTime to set
     */
    public void setReviewLastDateTime(String reviewLastDateTime) {
        this.reviewLastDateTime = reviewLastDateTime;
    }

    /**
     * @return the language
     */
    public LanguageTupleType getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(LanguageTupleType language) {
        this.language = language;
    }

    /**
     * @return the sourceSystemCd
     */
    public String getSourceSystemCd() {
        return sourceSystemCd;
    }

    /**
     * @param sourceSystemCd the sourceSystemCd to set
     */
    public void setSourceSystemCd(String sourceSystemCd) {
        this.sourceSystemCd = sourceSystemCd;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the ssnInfo
     */
    public CustomerSsnInfoType getSsnInfo() {
        return ssnInfo;
    }

    /**
     * @param ssnInfo the ssnInfo to set
     */
    public void setSsnInfo(CustomerSsnInfoType ssnInfo) {
        this.ssnInfo = ssnInfo;
    }

	public CustomerAddressCollectionType getAddresses() {
		return addresses;
	}

	public void setAddresses(CustomerAddressCollectionType addresses) {
		this.addresses = addresses;
	}

	public ContactCollectionType getContacts() {
		return contacts;
	}

	public void setContacts(ContactCollectionType contacts) {
		this.contacts = contacts;
	} 
	//Griffin's code: added a field to hold incomes as well as a getter and setter method
    public IncomeCollectionType incomes;
	
	/**
	 * @return the income
	 */
	public IncomeCollectionType getIncome() {
		return incomes;
	}
	
	/**
	 * @param incomes the incomes to set
	 */
	public void setIncome(IncomeCollectionType incomes) {
		this.incomes = incomes;
	}

}
