package com.example.hiber.controller;

import com.example.hiber.personData.Person;
import com.example.hiber.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class Controller {

    @RestController
    @AllArgsConstructor
    public static class PersonController {

        private Repository repository;

        @GetMapping("/persons/by-city")
        public List<Person> getPersonsByCity(@RequestParam String city) {
            return repository.getPersonsByCity(city);
        }
    }

}
