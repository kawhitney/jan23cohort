// Library
package com.codingdojo.databasecall.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.databasecall.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long>{ // <model, datatype> NOTE: datatype must match id in the model
	List<Contact> findAll();
	// Repo gets imported into service
}
