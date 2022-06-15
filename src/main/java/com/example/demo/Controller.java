package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class Controller {

    private PersonRepository personRepository;

    public String createPerson(@RequestParam String name) {
        personRepository.save(new Person(name, "6,7"));


    }
}
