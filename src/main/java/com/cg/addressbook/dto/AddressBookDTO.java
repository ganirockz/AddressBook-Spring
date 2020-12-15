package com.cg.addressbook.dto;

import lombok.Data;

@Data
public class AddressBookDTO {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
}
