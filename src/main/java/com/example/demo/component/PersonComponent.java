package com.example.demo.component;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.person.*;

@Component
public class PersonComponent {

	@Autowired
	PersonSvc persvc;
	
	public Person getPerson(String firstName, String lastName, Optional<String> age) {
		Integer personAge = persvc.getAge(age);
		return persvc.getSvc(firstName, lastName, personAge);
	}
	
}
