package com.cg.addressbook.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.cg.addressbook.dto.ResponseDTO;
import com.cg.addressbook.model.PersonData;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getPersonData(){
		PersonData personData = null;
		personData = new PersonData("Ganesh","Rapeti", "1-51A,Venkupalem", "Anakapalle", "Andhra Pradesh", "190007", "9866832480", "ganeshrapeti8@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@RequestMapping("/get/{fName}")
	public ResponseEntity<ResponseDTO> getPersonData(@PathVariable("fName") String firstName){
		PersonData personData = null;
		personData = new PersonData("Ganesh","Rapeti", "1-51A,Venkupalem", "Anakapalle", "Andhra Pradesh", "190007", "9866832480", "ganeshrapeti8@gmail.com");
		personData.setFirstName(firstName);
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful for first Name", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addPersonData(){
		PersonData personData = null;
		personData = new PersonData("Ganesh","Rapeti", "1-51A,Venkupalem", "Anakapalle", "Andhra Pradesh", "190007", "9866832480", "ganeshrapeti8@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Create Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(){
		PersonData personData = null;
		personData = new PersonData("Ganesh","Rapeti", "1-51A,Venkupalem", "Anakapalle", "Andhra Pradesh", "190007", "9866832480", "ganeshrapeti8@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Update Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{fName}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("fName") String firstName){
		PersonData personData = null;
		personData = new PersonData("Ganesh","Rapeti", "1-51A,Venkupalem", "Anakapalle", "Andhra Pradesh", "190007", "9866832480", "ganeshrapeti8@gmail.com");
		ResponseDTO respDTO = new ResponseDTO("Delete Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
