package com.example.service;
import com.example.data.Person;
import com.example.data.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}