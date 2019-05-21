package com.advanceamerica.graphqlcustomer.model;

import java.util.List;
import java.util.ArrayList;

/*
 * Almost copy pasted from CustomerAddressCollectionType, the only difference being the type of objects being stored in the list (incomes instead of addresses)
 */
public class IncomeCollectionType {

	protected List<IncomeType> incomes;
	
	public List<IncomeType> getIncomes() {
		if (this.incomes == null)
			this.incomes = new ArrayList();
		return this.incomes;
	}
}