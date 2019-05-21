package com.advanceamerica.graphqlcustomer.restclients;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class AARequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("X_ConsumerName", "graphql-test");
        template.header("X_ConsumerTrackingId", "graphql-test");
    }
}
