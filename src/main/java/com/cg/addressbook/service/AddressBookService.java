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
	
	public AddressBookData getPersonById(Long id) {
		AddressBookData personData = addressBookRepository.findById(id).orElseThrow(() -> new AddressBookException("Person Not Found"));
		return personData;
	}
	
	public AddressBookData createPersonData(AddressBookDTO addressBookDTO) {
		AddressBookData person = null;
		person = new AddressBookData(addressBookDTO);
		addressBookRepository.save(person);
		return person;
	}
	
	public AddressBookData updatePersonData(Long id,AddressBookDTO addressBookDTO) {
		AddressBookData person = this.getPersonById(id);
		person.setFirstName(addressBookDTO.getFirstName());
		person.setLastName(addressBookDTO.getLastName());
		person.setAddress(addressBookDTO.getAddress());
		person.setCity(addressBookDTO.getCity());
		person.setState(addressBookDTO.getCity());
		person.setPhoneNumber(addressBookDTO.getPhoneNumber());
		person.setZip(addressBookDTO.getZip());
		addressBookRepository.save(person);
		return person;
	}
	
	public void deletePersonData(Long id) {
		addressBookRepository.deleteById(id);
	}
	
}
