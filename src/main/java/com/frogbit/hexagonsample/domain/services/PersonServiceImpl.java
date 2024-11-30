package com.frogbit.hexagonsample.domain.services;
import com.frogbit.hexagonsample.domain.doorIn.IPersonService;
import com.frogbit.hexagonsample.domain.doorOut.IPersonRepositoryDoor;
import com.frogbit.hexagonsample.domain.entities.Person;

import java.util.List;

public class PersonServiceImpl implements IPersonService {

    IPersonRepositoryDoor personRepositoryDoor;

    public PersonServiceImpl(IPersonRepositoryDoor personRepository){
        this.personRepositoryDoor = personRepository;
    }

    public List<Person> findAll(){
        return personRepositoryDoor.findAll();
    }

    public Person findById(long id){
        return personRepositoryDoor.findById(id);
    }
}
