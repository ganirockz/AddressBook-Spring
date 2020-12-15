package com.cg.addressbook.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<String> getPersonData(){
		return new ResponseEntity<String>("Get Call Success",HttpStatus.OK);
	}
	
	@RequestMapping("/get/{fName}")
	public ResponseEntity<String> getPersonData(@PathVariable("fName") String firstName){
		return new ResponseEntity<String>("Get Call Success for first name: "+firstName,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addPersonData(){
		return new ResponseEntity<String>("Created Employee Payroll Data ", HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployeePayrollData(){
		return new ResponseEntity<String>("Updated Employee Payroll Data ",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{fName}")
	public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("fName") String firstName){
		return new ResponseEntity<String>("Delete Call Success for firstName: "+firstName,HttpStatus.OK);
	}
}
