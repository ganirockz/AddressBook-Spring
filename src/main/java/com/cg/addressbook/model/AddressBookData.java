package com.cg.addressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.addressbook.dto.AddressBookDTO;

@Entity
@Table(name = "address_book")
public class AddressBookData {
	@Id
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public AddressBookData(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber,String email) {
		this.firstName =firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public AddressBookData() {
		
	}
	public AddressBookData(AddressBookDTO addressBookDTO) {
		this.firstName = addressBookDTO.getFirstName();
		this.lastName = addressBookDTO.getLastName();
		this.address = addressBookDTO.getAddress();
		this.city = addressBookDTO.getCity();
		this.state = addressBookDTO.getState();
		this.zip = addressBookDTO.getZip();
		this.phoneNumber = addressBookDTO.getPhoneNumber();
		this.email = addressBookDTO.getEmail();
	}
}
