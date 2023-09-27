package com.example.hiber;

import com.example.hiber.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;

import javax.transaction.Transactional;

@SpringBootApplication
public class HiberApplication implements CommandLineRunner {
    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(HiberApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {

    }
}
