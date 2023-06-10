package com.example.demo.person;

public class Person {

	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Integer getAge() {
		return age;
	}
	private Integer age;
	public Person(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person() {}
	
}
