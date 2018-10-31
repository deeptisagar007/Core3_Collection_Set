package com.marlabs.typesofrelations;

import java.util.Set;

public class Employee {
	int empNumber;
	String empName;

	private Set<Address> addressList;

	/**
	 * @param empNumber
	 * @param empName
	 */
	public Employee(int empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
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
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", addressList=" + addressList + "]";
	}

}
