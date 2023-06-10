package com.example.demo.controller;

import com.example.demo.person.*;
import com.example.demo.component.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class TestHttpMethod {
	
	@Autowired
	PersonComponent personComp;

	@GetMapping("/person/{firstName}/{lastName}")
	public ResponseEntity<Person> customMessage(
			@PathVariable String firstName,
			@PathVariable String lastName,
			@RequestParam Optional<String> age
			) {
			
		Person person = personComp.getPerson(firstName, lastName, age);
		if(person != null) {
			return ResponseEntity.status(HttpStatus.OK).body(person);
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		
	}
	
	@PostMapping("/createperson")
	public ResponseEntity<Person> createPerson(
			@RequestBody Person person
			){
		return ResponseEntity.ok().body(person);
	}
	
	@PutMapping("/modifyperson")
	public ResponseEntity<Person> modifyPerson(
			@RequestBody Person person
			){
		return ResponseEntity.ok().body(person);
	}
	
	@DeleteMapping("/delperson")
	public ResponseEntity<Person> deletePerson(
			@RequestBody Person person
			){
		return ResponseEntity.ok().body(person);
	}
	
}
