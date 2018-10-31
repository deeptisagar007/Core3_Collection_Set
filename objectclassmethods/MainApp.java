package com.marlabs.objectclassmethods;

import java.util.HashSet;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("MAin Starts");
		Customer customer1 = new Customer(1, "ABC", "PAss", "XYZ");
		Class className = customer1.getClass();
		System.out.println(className);
		String classNameValue = className.getName();
		System.out.println("Name of the Class: " + classNameValue);

		Customer customer2 = new Customer(1, "ABC", "PAss", "XYZ");

		int hashCode = customer1.hashCode();
		System.out.println("Customer HashCode: " + hashCode);
		int hashCode2 = customer2.hashCode();
		System.out.println("Customer2 HashCode: " + hashCode2);

		boolean objectEqualFlag = customer1.equals(customer2);
		if (objectEqualFlag) {
			System.out.println("Objects were equal");
		}

		Set<Customer> customerSet = new HashSet<Customer>();
		customerSet.add(customer1);
		customerSet.add(customer2);
		for (Customer cust : customerSet) {
			System.out.println(cust);
		}

		try {
			Object obj = customer1.clone();
			Customer customer3 = (Customer) obj;
			System.out.println("This is Cloned Customer 3: " + customer3);
			if (customer1 == customer3) {
				System.out.println("Same Memory");
			} else {
				System.out.println("Different Memory ");
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.gc();

		System.out.println("MAin Ends");

	}

}
