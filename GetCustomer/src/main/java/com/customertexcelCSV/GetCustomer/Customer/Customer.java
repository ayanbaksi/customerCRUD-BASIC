package com.customertexcelCSV.GetCustomer.Customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
@Override
	public String toString() {
		return "Customer [orgid=" + orgid + ", fullname=" + fullname + ", date_of_birth=" + date_of_birth + ", mobile="
				+ mobile + ", gender=" + gender + ", addresses_address1=" + addresses_address1 + ", addresses_address2="
				+ addresses_address2 + ", addresses_state=" + addresses_state + ", addresses_pin_code="
				+ addresses_pin_code + "]";
	}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer  orgid;
private String fullname;
private String date_of_birth;
private Long mobile;
private char gender;
private String addresses_address1;
private String addresses_address2;
private String addresses_state;
private Integer addresses_pin_code;
private String MyUnknownColumn;
public Customer() {
	super();
}
public Integer getOrgid() {
	return orgid;
}
public void setOrgid(Integer orgid) {
	this.orgid = orgid;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getDate_of_birth() {
	return date_of_birth;
}
public void setDate_of_birth(String date_of_birth) {
	this.date_of_birth = date_of_birth;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public String getAddresses_address1() {
	return addresses_address1;
}
public void setAddresses_address1(String addresses_address1) {
	this.addresses_address1 = addresses_address1;
}
public String getAddresses_address2() {
	return addresses_address2;
}
public void setAddresses_address2(String addresses_address2) {
	this.addresses_address2 = addresses_address2;
}
public String getAddresses_state() {
	return addresses_state;
}
public void setAddresses_state(String addresses_state) {
	this.addresses_state = addresses_state;
}
public Integer getAddresses_pin_code() {
	return addresses_pin_code;
}
public void setAddresses_pin_code(Integer addresses_pin_code) {
	this.addresses_pin_code = addresses_pin_code;
}
public String getMyUnknownColumn() {
	return MyUnknownColumn;
}
public void setMyUnknownColumn(String myUnknownColumn) {
	MyUnknownColumn = myUnknownColumn;
}
public Customer(Integer orgid, String fullname, String date_of_birth, Long mobile, char gender,
		String addresses_address1, String addresses_address2, String addresses_state, Integer addresses_pin_code,
		String myUnknownColumn) {
	super();
	this.orgid = orgid;
	this.fullname = fullname;
	this.date_of_birth = date_of_birth;
	this.mobile = mobile;
	this.gender = gender;
	this.addresses_address1 = addresses_address1;
	this.addresses_address2 = addresses_address2;
	this.addresses_state = addresses_state;
	this.addresses_pin_code = addresses_pin_code;
	MyUnknownColumn = myUnknownColumn;
}


}
