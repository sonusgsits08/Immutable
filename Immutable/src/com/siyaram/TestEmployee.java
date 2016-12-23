package com.siyaram;

public class TestEmployee {
	public static void main(String[] args) {
		String ename="Ram";
		Integer eage =20;
		String street="10 AB Road";
		String city="Indore";
		String pincode="452003";
		Address address = new Address(street, pincode, city);
		Employee emp = new Employee(ename, eage, address);
				
		System.out.println("Before change Employee details:"+emp);
	    address.setCity("Bhopal");
		//emp = new Employee(ename, eage, address);
		System.out.println("After change Employee details: "+emp);
		
	}
}
