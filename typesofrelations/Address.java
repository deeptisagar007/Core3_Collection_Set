package com.marlabs.typesofrelations;

public class Address {
	private int streetNumber;
	private String houseNumber;
	private String streetName;
	private long pinCode;
	private String cityName;

	/**
	 * @param streetNumber
	 * @param houseNumber
	 * @param streetName
	 * @param pinCode
	 * @param cityName
	 */
	public Address(int streetNumber, String houseNumber, String streetName, long pinCode, String cityName) {
		this.streetNumber = streetNumber;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.pinCode = pinCode;
		this.cityName = cityName;
	}

	/**
	 * @return the streetNumber
	 */
	public int getStreetNumber() {
		return streetNumber;
	}

	/**
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @return the pinCode
	 */
	public long getPinCode() {
		return pinCode;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [streetNumber=" + streetNumber + ", houseNumber=" + houseNumber + ", streetName=" + streetName
				+ ", pinCode=" + pinCode + ", cityName=" + cityName + "]";
	}

}
