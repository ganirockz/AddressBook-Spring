package com.cg.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.cg.addressbook.dto.AddressBookDTO;
import com.cg.addressbook.dto.ResponseDTO;
import com.cg.addressbook.model.AddressBookData;
import com.cg.addressbook.service.AddressBookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "Controller to handle all requests")
@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:3001" },allowedHeaders = "*")
@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@Autowired
	private AddressBookService addressBookService;
	
	@ApiOperation(value = "API to get data")
	@GetMapping("/get")
	public ResponseEntity<List<AddressBookData>> getPersonData(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(addressBookService.getPersonData());
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@ApiOperation(value = "API to get data based on id")
	@GetMapping("/get/{id}")
	public ResponseEntity<AddressBookData> getPersonData(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body(addressBookService.getPersonById(id));
	}
	
	@ApiOperation(value = "API to add data")
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addPersonData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData personData = addressBookService.createPersonData(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@ApiOperation(value="API to update data based on id")
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updatePersonData(@PathVariable("id")  Long id, @RequestBody AddressBookDTO addressBookDTO){
		AddressBookData personData = addressBookService.updatePersonData(id,addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Update Call Successful", personData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@ApiOperation(value = "API to delete data based on id")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deletePersonData(@PathVariable("id") Long id){
		addressBookService.deletePersonData(id);
		ResponseDTO respDTO = new ResponseDTO("Delete Call Successful","for given id");
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
