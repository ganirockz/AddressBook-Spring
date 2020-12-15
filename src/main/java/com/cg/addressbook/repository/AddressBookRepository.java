package com.cg.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.addressbook.model.AddressBookData;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData,String> {

}
