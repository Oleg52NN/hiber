package com.example.hiber.repository;

import com.example.hiber.personData.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
@AllArgsConstructor
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;
    private PersonRepository personRepository;

    public Optional<Person> getPersonsByNameAndSurname(String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }

    public List<Person> getPersonsByAge(int age) {
        return personRepository.findByAgeLessThanOrderByAgeAsc(age);
    }

    public List<Person> getPersonsByCity(String city) {
        return personRepository.findByCityOfLiving(city);
        //        return personRepository.findAll(PageRequest.of(0, 2, Sort.by("id").descending()));
    }
}
