package com.advanceamerica.graphqlcustomer.resolvers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.advanceamerica.graphqlcustomer.model.ContactCollectionType;
import com.advanceamerica.graphqlcustomer.model.CustomerAddressCollectionType;
import com.advanceamerica.graphqlcustomer.model.CustomerType;
import com.advanceamerica.graphqlcustomer.restclients.AARequestInterceptor;
import com.advanceamerica.graphqlcustomer.restclients.AdvanceAmericaRestServer;
import com.advanceamerica.graphqlcustomer.restmodels.CustomerGetResponse;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;

@Component
public class Query implements GraphQLQueryResolver {

    @Value("${rest.baseurl}")
    private String baseUrl;

    AdvanceAmericaRestServer restServer;

    @PostConstruct
    private void Init() {
        restServer = Feign.builder()
                .requestInterceptor(new AARequestInterceptor())
                .decoder(new JacksonDecoder())
                .logLevel(Logger.Level.FULL)
                .target(AdvanceAmericaRestServer.class, baseUrl);
    }

    public CustomerType getCustomer(String sourceCustomerId) {

        CustomerGetResponse customerGetResponse = restServer.getCustomer(sourceCustomerId);
        return customerGetResponse.getCustomerInfo();
    }

    public CustomerAddressCollectionType getCustomerAddress(String sourceCustomerId) {

        CustomerGetResponse customerGetResponse = restServer.getCustomerAddress(sourceCustomerId);
        return customerGetResponse.getCustomerInfo().getAddresses();
    }
    
    public ContactCollectionType getCustomerContact(String sourceCustomerId) {

        CustomerGetResponse customerGetResponse = restServer.getCustomerContact(sourceCustomerId);
        return customerGetResponse.getCustomerInfo().getContacts();
    }
    
    

}
