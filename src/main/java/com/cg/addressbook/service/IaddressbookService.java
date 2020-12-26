package com.cg.addressbook.service;

import java.util.List;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.model.AddressBookData;

public interface IaddressbookService {
	public List<AddressBookData> getPersonData();
	
	public AddressBookData getPersonById(Long id);
	
	public AddressBookData createPersonData(AddressBookDTO addressBookDTO);
	
	public AddressBookData updatePersonData(Long id,AddressBookDTO addressBookDTO);
	
	public void deletePersonData(Long id);
}
