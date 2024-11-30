package com.frogbit.hexagonsample.domain.services;

import com.frogbit.hexagonsample.domain.doorOut.DefaultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public String tryIt(){
        return "Hello World";
    }
}
