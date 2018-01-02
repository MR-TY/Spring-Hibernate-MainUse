package com.ty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.PersonDAO;
import com.ty.pojo.Person;

@Service
@Transactional
public class PersonService {
	@Autowired
	private PersonDAO personDAO;
	
	public void createPerson(Person person){
		personDAO.createPerson(person);
	}
}
