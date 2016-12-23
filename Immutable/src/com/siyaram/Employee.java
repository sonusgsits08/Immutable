package com.siyaram;
final class Employee {
	final private String ename;
	final private Integer eage;
	final private Address eaddress;
	
	public Address getEaddress() {
		Address add = new Address(eaddress.getStreet(),eaddress.getCity(),eaddress.getPincode());
		return add;
//		return eaddress;
	}
	public String getEname() {
		return ename;
	}
	public Integer getEage() {
		return eage;
	}

	Employee(String ename,Integer eage,Address eaddress){
		this.ename=ename;
		this.eage=eage;
		this.eaddress= new Address(eaddress.getStreet(),eaddress.getPincode(),eaddress.getCity());
	}
	@Override
	public String toString() {
		return "[ Employee name:"+ename+" age:"+eage+" Address:"+eaddress+" ]";
	}
}
