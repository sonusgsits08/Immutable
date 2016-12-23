package com.siyaram;
final class Employee {
	private String ename;
	private Integer eage;
	private Address eaddress;
	
	private Address getEaddress() {
		return eaddress;
	}

	private void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

	Employee(String ename,Integer eage,Address eaddress){
		this.ename=ename;
		this.eage=eage;
		this.eaddress=eaddress;
	}
	
	@Override
	public String toString() {
		return "Employee name:"+ename+" age:"+eage+" Address:"+eaddress;
	}
//	private void setEaddress(Address eaddress) {
//		this.eaddress = eaddress;
//	}
//	private String getEname() {
//		return ename;
//	}
//	private Integer getEage() {
//		return eage;
//	}
//	private Address getEaddress() {
//		return eaddress;
//	}
}
