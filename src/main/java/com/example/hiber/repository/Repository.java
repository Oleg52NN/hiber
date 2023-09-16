package com.example.hiber.repository;

import com.example.hiber.personData.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;

import java.util.List;
@org.springframework.stereotype.Repository
@AllArgsConstructor
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select user from Person user where user.cityOfLiving = :city order by user.cityOfLiving", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
