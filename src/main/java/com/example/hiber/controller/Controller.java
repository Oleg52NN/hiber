package com.example.hiber.controller;

import com.example.hiber.personData.Person;
import com.example.hiber.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

public class Controller {

    @RestController
    @AllArgsConstructor
    public static class PersonController {

        private Repository repository;

        @GetMapping("/persons/by-city")
        public List<Person> getPersonsByCity(@RequestParam String city) {
            return repository.getPersonsByCity(city);
        }
        @GetMapping("/persons/by-age")
        public List<Person> getPersonsByAge(@RequestParam int age) {
            return repository.getPersonsByAge(age);
        }
        @GetMapping("/persons/by-name&surname")
        public Optional<Person> getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
            return repository.getPersonsByNameAndSurname(name, surname);
        }

    }

}
