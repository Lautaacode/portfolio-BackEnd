package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Person;
import com.Blanco.Portfolio.service.SPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
@CrossOrigin(origins = "*")
public class CPerson {
    @Autowired
    private SPerson sPerson;

    @PostMapping("/add")
    public Person createPerson(@RequestBody Person person){
        Person person1 = sPerson.createPerson(person);
        return person;
    }
    @GetMapping("/show")
    public List<Person> getPersons(){
        return sPerson.getPersons();
    }

    @PutMapping("/update/{id}")
    public Person updatePerson(@RequestBody Person person, @PathVariable("id") long id){
        return sPerson.updatePerson(person,id);
    }

    @DeleteMapping("/delete/{id}")
    public  String deletePerson(@PathVariable("id") long id){
        sPerson.deletePerson(id);
        return "El usuario se elimino correctamente";
    }
    @GetMapping("/show/{id}")
    public  Person getPerson(@PathVariable("id") long id){
        return sPerson.getPerson(id);
    }
}