package com.cg.addressbook.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.exception.AddressBookException;
import com.cg.addressbook.model.AddressBookData;
import com.cg.addressbook.repository.AddressBookRepository;

@Service
public class AddressBookService {
	
	@Autowired
	private AddressBookRepository addressBookRepository;
	
	public List<AddressBookData> getPersonData() {
		return addressBookRepository.findAll();
	}
	
	public AddressBookData getPersonByFirstName(String firstName) {
		AddressBookData personData = addressBookRepository.findById(firstName).orElseThrow(() -> new AddressBookException("Person Not Found"));
		return personData;
	}
	
	public AddressBookData createPersonData(AddressBookDTO addressBookDTO) {
		AddressBookData person = null;
		person = new AddressBookData(addressBookDTO);
		addressBookRepository.save(person);
		return person;
	}
	
	public AddressBookData updatePersonData(String firstName,AddressBookDTO addressBookDTO) {
		AddressBookData person = this.getPersonByFirstName(firstName);
		person.setAddress(addressBookDTO.getAddress());
		addressBookRepository.save(person);
		return person;
	}
	
	public void deletePersonData(String firstName) {
		addressBookRepository.deleteById(firstName);
	}
	
}
