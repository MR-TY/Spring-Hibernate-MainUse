package com.ty.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.pojo.Person;

@Repository
public class PersonDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createPerson(Person person){
		sessionFactory.openSession().save(person);
	}
}
