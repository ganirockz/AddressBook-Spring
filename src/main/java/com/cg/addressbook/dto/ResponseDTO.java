package com.cg.addressbook.dto;

import java.util.List;

import com.cg.addressbook.model.AddressBookData;

import lombok.Data;

@Data
public class ResponseDTO {
	private String message;
	private Object data;

	public ResponseDTO(String message, AddressBookData personData) {
		this.message = message;
		this.data = personData;
	}

	public ResponseDTO(String message, String firstName) {
		this.message = message;
	}

	public ResponseDTO(String message, List<String> errMesg) {
		this.message = message;
	}
}
