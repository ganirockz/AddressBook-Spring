package com.cg.addressbook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cg.addressbook.dto.AddressBookDTO;

import lombok.Data;

@Data
@Entity
@Table(name = "addressbook")
public class AddressBookData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
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
	
	
	public AddressBookData(String firstName,String lastName,String address,String city,String state,String zip,String phoneNumber,String email) {
		this.firstName =firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
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
	}
}
