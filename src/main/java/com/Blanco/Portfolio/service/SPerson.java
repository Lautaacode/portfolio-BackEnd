package com.Blanco.Portfolio.service;


import com.Blanco.Portfolio.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SPerson {
    public Person createPerson(Person person);

    public List<Person> getPersons();

    public Person getPerson(long id);

    public void deletePerson(long id);

    public Person updatePerson(Person person, long id);
}