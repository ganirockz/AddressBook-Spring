package com.cg.addressbook.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.model.PersonData;

@Service
public class AddressBookService {
	
	private List<PersonData> personDataList = new ArrayList<PersonData>();
	
	public List<PersonData> getPersonData() {
		return personDataList;
	}
	
	public PersonData getPersonByFirstName(String firstName) {
		PersonData personData = null;
		for(PersonData person: personDataList) {
			if(person.getFirstName().equals(firstName)) {
				personData = person;
			}
		}
		return personData;
	}
	
	public PersonData createPersonData(AddressBookDTO addressBookDTO) {
		PersonData person = null;
		person = new PersonData(addressBookDTO);
		return person;
	}
	
	public PersonData updatePersonData(String firstName,AddressBookDTO addressBookDTO) {
		PersonData person = this.getPersonByFirstName(firstName);
		person.setAddress(addressBookDTO.getAddress());
		return person;
	}
	
	public void deletePersonData(String firstName) {
		PersonData person = this.getPersonByFirstName(firstName);
		personDataList.remove(person);
	}
	
}
