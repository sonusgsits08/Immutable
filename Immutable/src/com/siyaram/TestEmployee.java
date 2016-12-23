package com.siyaram;

public class TestEmployee {
	public static void main(String[] args) {
		TestEmployee te = new TestEmployee();
		String ename="Ram";
		Integer eage =20;
		String street="10 AB Road";
		String city="Indore";
		String pincode="452003";
		Address address = new Address(street, pincode, city);
		Employee emp = new Employee(ename, eage, address);		
		System.out.println("Before change Employee details:"+emp);
		te.changeEmployee(emp.getEname(), emp.getEage(),emp.getEaddress());
		System.out.println("After change Employee details: "+emp);
	}
	void changeEmployee(String name,Integer age,Address ad){
		name="Shyam";
		age=30;
		ad.setCity("Bhopal");
	}
}