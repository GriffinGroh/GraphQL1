package com.advanceamerica.graphqlcustomer.model;

public class CustomerAddressType {

    protected AddressTupleType addressType;
   
    protected String addressLine1;
    
    protected String addressLine2;
    
    protected String city;
   
    protected StateTupleType state;
   
    protected CountryTupleType countryType;
   
    protected String postalCode;
    
    protected String postalCodePlusFour;
    
    protected GeoCodeType geoCode;
    
    protected String verifiedFlag;
    
    protected VerifiedMethodTupleType verifiedMethod;
    
    protected String verifiedDateTime;

    protected String apartmentNumber;

    protected String county;

    protected String monthsAtAddress;

    protected String canContactFlag;

    protected String canContactDateTime;

    protected String canContactMarketingFlag;

    protected String canMarketDateTime;

    protected String activeFlag;

    protected String activeDateTime;

    protected String seqNumber;

    protected DmaTupleType dma;

    /**
     * @return the apartmentNumber
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * @param apartmentNumber the apartmentNumber to set
     */
    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }

    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * @return the monthsAtAddress
     */
    public String getMonthsAtAddress() {
        return monthsAtAddress;
    }

    /**
     * @param monthsAtAddress the monthsAtAddress to set
     */
    public void setMonthsAtAddress(String monthsAtAddress) {
        this.monthsAtAddress = monthsAtAddress;
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
     * @return the canContactDateTime
     */
    public String getCanContactDateTime() {
        return canContactDateTime;
    }

    /**
     * @param canContactDateTime the canContactDateTime to set
     */
    public void setCanContactDateTime(String canContactDateTime) {
        this.canContactDateTime = canContactDateTime;
    }

    /**
     * @return the canContactMarketingFlag
     */
    public String getCanContactMarketingFlag() {
        return canContactMarketingFlag;
    }

    /**
     * @param canContactMarketingFlag the canContactMarketingFlag to set
     */
    public void setCanContactMarketingFlag(String canContactMarketingFlag) {
        this.canContactMarketingFlag = canContactMarketingFlag;
    }

    /**
     * @return the canMarketDateTime
     */
    public String getCanMarketDateTime() {
        return canMarketDateTime;
    }

    /**
     * @param canMarketDateTime the canMarketDateTime to set
     */
    public void setCanMarketDateTime(String canMarketDateTime) {
        this.canMarketDateTime = canMarketDateTime;
    }

    /**
     * @return the activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * @param activeFlag the activeFlag to set
     */
    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    /**
     * @return the activeDateTime
     */
    public String getActiveDateTime() {
        return activeDateTime;
    }

    /**
     * @param activeDateTime the activeDateTime to set
     */
    public void setActiveDateTime(String activeDateTime) {
        this.activeDateTime = activeDateTime;
    }

    /**
     * @return the seqNumber
     */
    public String getSeqNumber() {
        return seqNumber;
    }

    /**
     * @param seqNumber the seqNumber to set
     */
    public void setSeqNumber(String seqNumber) {
        this.seqNumber = seqNumber;
    }

    /**
     * @return the dma
     */
    public DmaTupleType getDma() {
        return dma;
    }

    /**
     * @param dma the dma to set
     */
    public void setDma(DmaTupleType dma) {
        this.dma = dma;
    }

    /**
     * @return the addressType
     */
    public AddressTupleType getAddressType() {
        return addressType;
    }

    /**
     * @param addressType the addressType to set
     */
    public void setAddressType(AddressTupleType addressType) {
        this.addressType = addressType;
    }

    /**
     * @return the addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * @param addressLine1 the addressLine1 to set
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
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
     * @return the countryType
     */
    public CountryTupleType getCountryType() {
        return countryType;
    }

    /**
     * @param countryType the countryType to set
     */
    public void setCountryType(CountryTupleType countryType) {
        this.countryType = countryType;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the postalCodePlusFour
     */
    public String getPostalCodePlusFour() {
        return postalCodePlusFour;
    }

    /**
     * @param postalCodePlusFour the postalCodePlusFour to set
     */
    public void setPostalCodePlusFour(String postalCodePlusFour) {
        this.postalCodePlusFour = postalCodePlusFour;
    }

    /**
     * @return the geoCode
     */
    public GeoCodeType getGeoCode() {
        return geoCode;
    }

    /**
     * @param geoCode the geoCode to set
     */
    public void setGeoCode(GeoCodeType geoCode) {
        this.geoCode = geoCode;
    }

    /**
     * @return the verifiedFlag
     */
    public String getVerifiedFlag() {
        return verifiedFlag;
    }

    /**
     * @param verifiedFlag the verifiedFlag to set
     */
    public void setVerifiedFlag(String verifiedFlag) {
        this.verifiedFlag = verifiedFlag;
    }

    /**
     * @return the verifiedMethod
     */
    public VerifiedMethodTupleType getVerifiedMethod() {
        return verifiedMethod;
    }

    /**
     * @param verifiedMethod the verifiedMethod to set
     */
    public void setVerifiedMethod(VerifiedMethodTupleType verifiedMethod) {
        this.verifiedMethod = verifiedMethod;
    }

    /**
     * @return the verifiedDateTime
     */
    public String getVerifiedDateTime() {
        return verifiedDateTime;
    }

    /**
     * @param verifiedDateTime the verifiedDateTime to set
     */
    public void setVerifiedDateTime(String verifiedDateTime) {
        this.verifiedDateTime = verifiedDateTime;
    }

    

}