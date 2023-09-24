package com.example.hiber.repository;

import com.example.hiber.personData.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface QueryRepository extends CrudRepository<Person, String> {

    @Query(value = "select p from Person p where p.cityOfLiving = :city")
    List<Person> findByCity(String city);

    @Query(value = "select p from Person p where p.age < :age")
    List<Person> findByAge(int age);

    @Query(value = "select p from Person p where p.name = :name and p.surname = :surname")
    Optional<Person> findByNameAndSurname(String name, String surname);

}
