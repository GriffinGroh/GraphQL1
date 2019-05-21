package com.advanceamerica.graphqlcustomer.restclients;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import com.advanceamerica.graphqlcustomer.restmodels.CustomerGetResponse;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "customer")
public interface AdvanceAmericaRestServer {

    @RequestLine("POST /CustomerMasterGet/v1/rs/customerMasterGetInfo")
    @Headers("Content-Type: application/json")
    @Body("%7B\"sourceCustomerId\": {source_customer_id}%7D")
    CustomerGetResponse getCustomer(@Param("source_customer_id") String source_customer_id);

    @RequestLine("POST /CustomerAddressGet/v1/rs/customerAddressGetInfo")
    @Headers("Content-Type: application/json")
    @Body("%7B\"sourceCustomerId\": {source_customer_id}%7D")
    CustomerGetResponse getCustomerAddress(@Param("source_customer_id") String source_customer_id);
    
    @RequestLine("POST /CustomerContactGet/v1/rs/customerContactGetInfo")
    @Headers("Content-Type: application/json")
    @Body("%7B\"sourceCustomerId\": {source_customer_id}%7D")
    CustomerGetResponse getCustomerContact(@Param("source_customer_id") String source_customer_id);
}
