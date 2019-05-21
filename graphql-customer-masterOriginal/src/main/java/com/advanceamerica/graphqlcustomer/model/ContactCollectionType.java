package com.advanceamerica.graphqlcustomer.model;

import java.util.ArrayList;
import java.util.List;

public class ContactCollectionType {
	
	 protected List<ContactType> contacts;
	  
	  public List<ContactType> getContacts()
	  {
	    if (this.contacts == null) {
	      this.contacts = new ArrayList();
	    }
	    return this.contacts;
	  }

}
