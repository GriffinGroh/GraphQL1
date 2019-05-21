package com.advanceamerica.graphqlcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GraphqlCustomer {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlCustomer.class, args);
    }

}
