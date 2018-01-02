package com.ty.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.pojo.Person;
import com.ty.service.PersonService;


public class TestSH {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonService personService = context.getBean(PersonService.class);
		personService.createPerson(new Person(3, "唐哈哈", 2000));
	}
}
