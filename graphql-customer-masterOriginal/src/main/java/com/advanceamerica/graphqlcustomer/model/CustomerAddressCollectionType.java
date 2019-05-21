package com.advanceamerica.graphqlcustomer.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerAddressCollectionType {

    protected List<CustomerAddressType> addresses;

    public List<CustomerAddressType> getAddresses() {
        if (this.addresses == null) {
            this.addresses = new ArrayList();
        }
        return this.addresses;
    }

}