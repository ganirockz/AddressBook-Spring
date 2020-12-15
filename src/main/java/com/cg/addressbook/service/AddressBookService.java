package com.cg.addressbook.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.model.PersonData;

@Service
public class AddressBookService {

	public List<PersonData> getPersonData() {
		List<PersonData> personList = new ArrayList<>();
		personList.add(new PersonData("Ganesh", "Rapeti", "1-51A,Venkupalem", "Anakapalle", "Andhra Pradesh", "190007",
				"9866832480", "ganeshrapeti8@gmail.com"));
		return personList;
	}
	
	public PersonData getPersonByFirstName(String firstName) {
		PersonData person = new PersonData("Ganesh", "Rapeti", "1-51A,Venkupalem", "Anakapalle", "Andhra Pradesh", "190007",
				"9866832480", "ganeshrapeti8@gmail.com");
		return person;
	}
	
	public PersonData createPersonData(AddressBookDTO addressBookDTO) {
		PersonData person = null;
		person = new PersonData(addressBookDTO);
		return person;
	}
	
	public PersonData updatePersonData(AddressBookDTO addressBookDTO) {
		PersonData person = null;
		person = new PersonData(addressBookDTO);
		return person;
	}
	
	public void deletePersonData(String firstName) {
		
	}
}
