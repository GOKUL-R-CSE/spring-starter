package com.example.demo.component;

import com.example.demo.person.*;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class PersonSvc {
	
	public Person getSvc(String firstName, String lastName, Integer age) {
		if (age != null) {
			return new Person(firstName, lastName, age);
		}
		return new Person(firstName, lastName);
	}
	
	public Integer getAge(Optional<String> age) {
		if (age.isPresent()) {
			try {
				return Integer.parseInt(age.get());
			} catch (Exception e) {
				return null;
			}
		}
		return null;
	}

}
