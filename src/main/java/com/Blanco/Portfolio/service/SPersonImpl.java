package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Person;

import com.Blanco.Portfolio.repository.RPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SPersonImpl implements SPerson {

    @Autowired
    private RPerson rPerson;
    @Override
    public Person createPerson(Person person) {
        return rPerson.save(person);
    }

    @Override
    public List<Person> getPersons() {
        return (List<Person>) rPerson.findAll();
    }

    @Override
    public Person getPerson(long id) {
        return rPerson.findById(id).get();
    }

    @Override
    public void deletePerson(long id) {
        rPerson.deleteById(id);
    }

    @Override
    public Person updatePerson(Person person, long id) {
        Person person1 = rPerson.findById(id).get();
        person1.setName(person.getName());
        person1.setLastname(person.getLastname());
        person1.setTitle(person.getTitle());
        person1.setAboutMe(person.getAboutMe());
        person1.setProfileImg(person.getProfileImg());
        person1.setBannerImg(person.getBannerImg());
        person1.setJobImg(person.getJobImg());
        person1.setJobLink(person.getJobLink());
        person1.setStudyImg(person.getStudyImg());
        person1.setStudyLink(person.getStudyLink());
        return rPerson.save(person1);
    }
}