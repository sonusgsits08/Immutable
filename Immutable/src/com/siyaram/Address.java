package com.siyaram;

public class Address {
private String street;
private String pincode;
private String city;

Address(String street,String pincode,String city){
	this.street=street;
	this.pincode=pincode;
	this.city=city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

@Override
	public String toString() {
		return "Street: "+street+" Pincode: "+pincode+" City:"+city;
	}
}
