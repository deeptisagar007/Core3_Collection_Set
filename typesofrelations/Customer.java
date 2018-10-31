package com.marlabs.typesofrelations;

import java.util.Set;

public class Customer {
	int custNumber;
	String custName;

	private Set<Address> addressList;

	/**
	 * @param custNumber
	 * @param custName
	 */
	public Customer(int custNumber, String custName) {
		this.custNumber = custNumber;
		this.custName = custName;
	}

	/**
	 * @return the addressList
	 */
	public Set<Address> getAddressList() {
		return addressList;
	}

	/**
	 * @param addressList
	 *            the addressList to set
	 */
	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [custNumber=" + custNumber + ", custName=" + custName + ", addressList=" + addressList + "]";
	}

}
