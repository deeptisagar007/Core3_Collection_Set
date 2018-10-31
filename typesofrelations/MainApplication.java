package com.marlabs.typesofrelations;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Main Starts");

		Employee employee1 = new Employee(1, "Emp_Deepti");
		Customer customer1 = new Customer(1, "Cust_Deepti");
		Address emp1PerAddress = new Address(123, "XYZ", "ABC", 1000001, "NJ");
		Address emp1LocalAddress = new Address(111, "#1", "XYZ", 100000001, "NY");
		Set<Address> emp1Address = new HashSet<Address>();
		emp1Address.add(emp1LocalAddress);
		emp1Address.add(emp1PerAddress);
		employee1.setAddressList(emp1Address);
		System.out.println("Employee 1 Details: ");
		System.out.println(employee1.toString());

		Address cust1PerAddress = new Address(1, "#4", "MNO", 20000002, "NJ");
		Address cust1LocalAddress = new Address(10, "#5", "OPQ", 300000003, "NY");
		Set<Address> cust1Address = new HashSet<Address>();
		cust1Address.add(cust1LocalAddress);
		cust1Address.add(cust1PerAddress);
		customer1.setAddressList(cust1Address);
		System.out.println("Customer 1 Details");
		System.out.println(customer1);
		System.out.println("Main Ends");
		Calendar calender = Calendar.getInstance();
		System.out.println(calender.getTimeZone());
	}

}
