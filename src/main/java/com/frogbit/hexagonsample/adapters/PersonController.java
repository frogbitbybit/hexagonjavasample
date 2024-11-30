package com.frogbit.hexagonsample.adapters;

import com.frogbit.hexagonsample.domain.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public String tryIt(){
        return personService.tryIt();
    }
}
