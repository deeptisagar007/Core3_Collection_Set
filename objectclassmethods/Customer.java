package com.marlabs.objectclassmethods;

public class Customer implements Cloneable {
	private int customerId;
	private String customerName;
	private String customerPassWord;
	private String customeCityName;

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerPassWord
	 * @param customeCityName
	 */
	public Customer(int customerId, String customerName, String customerPassWord, String customeCityName) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassWord = customerPassWord;
		this.customeCityName = customeCityName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassWord="
				+ customerPassWord + ", customeCityName=" + customeCityName + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		System.out.println("HashCode MEthod");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customeCityName == null) ? 0 : customeCityName.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPassWord == null) ? 0 : customerPassWord.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equal Methods");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (customeCityName == null) {
			if (other.customeCityName != null) {
				return false;
			}
		} else if (!customeCityName.equals(other.customeCityName)) {
			return false;
		}
		if (customerId != other.customerId) {
			return false;
		}
		if (customerName == null) {
			if (other.customerName != null) {
				return false;
			}
		} else if (!customerName.equals(other.customerName)) {
			return false;
		}
		if (customerPassWord == null) {
			if (other.customerPassWord != null) {
				return false;
			}
		} else if (!customerPassWord.equals(other.customerPassWord)) {
			return false;
		}
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() {
		System.out.println("From Finalize Method");
	}

}
