package org.gana.test1.controller;

import org.gana.test1.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@Autowired
	PersonRepository repository;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {

		return "Welcome to Spring Security tutorial :)";
	}

	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public Iterable<Person> getPersons() {

		return repository.findAll();
	}

	@RequestMapping(value = "/persons/add", method = RequestMethod.GET)
	public Person addPerson(@RequestParam String login, @RequestParam String label) throws Exception {

		if (label == null)
			throw new Exception("Missing parameter label");
		Person person = new Person();
		person.setLabel(label);
		person.setLogin(login);
		return repository.save(person);
	}
}