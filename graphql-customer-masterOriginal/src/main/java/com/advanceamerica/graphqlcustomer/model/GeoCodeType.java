package com.advanceamerica.graphqlcustomer.model;

public class GeoCodeType {
  protected DmaTupleType dmaType;
  
  protected String latitude;
 
  protected String longitude;
  
  protected String verifiedFlag;
  
  protected VerifiedMethodTupleType verifiedMethod;
 
  protected String verifiedDateTime;

    /**
     * @return the dmaType
     */
    public DmaTupleType getDmaType() {
        return dmaType;
    }

    /**
     * @param dmaType the dmaType to set
     */
    public void setDmaType(DmaTupleType dmaType) {
        this.dmaType = dmaType;
    }

    /**
     * @return the latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
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