package com.frogbit.hexagonsample.adapters.controllers;

import com.frogbit.hexagonsample.domain.doorIn.IPersonService;
import com.frogbit.hexagonsample.domain.entities.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final IPersonService personService;

    public PersonController(IPersonService personService){
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPeople(){
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable long id){
        return personService.findById(id);
    }


}
