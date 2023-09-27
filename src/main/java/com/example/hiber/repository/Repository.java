package com.example.hiber.repository;

import com.example.hiber.personData.Person;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
@AllArgsConstructor
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;
    private PersonRepository personRepository;
    private QueryRepository queryRepository;

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return queryRepository.findByNameAndSurname(name, surname);
    }

    public List<Person> getPersonsByAge(int age) {
        return queryRepository.findByAge(age);
    }

    public List<Person> findByCity(String city) {
        return queryRepository.findByCity(city);
    }
}
