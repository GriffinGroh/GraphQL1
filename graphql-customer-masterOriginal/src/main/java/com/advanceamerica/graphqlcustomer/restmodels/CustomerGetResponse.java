package com.advanceamerica.graphqlcustomer.restmodels;

import com.advanceamerica.graphqlcustomer.model.CustomerType;
import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "statusResponse",
        "customerInfo"
})
public class CustomerGetResponse {

    @JsonProperty("statusResponse")
    private StatusResponse statusResponse;
    @JsonProperty("customerInfo")
    private CustomerType customerInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("customerInfo")
    public CustomerType getCustomerInfo() {
        return customerInfo;
    }

    @JsonProperty("customerInfo")
    public void setCustomerInfo(CustomerType value) {
        this.customerInfo = value;
    }


    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("statusResponse")
    public StatusResponse getStatusResponse() {
        return statusResponse;
    }

    @JsonProperty("statusResponse")
    public void setStatusResponse(StatusResponse statusResponse) {
        this.statusResponse = statusResponse;
    }
}
