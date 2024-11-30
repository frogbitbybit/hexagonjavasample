package com.frogbit.hexagonsample.domain.doorOut;

import com.frogbit.hexagonsample.domain.entities.Person;
import java.util.List;

public interface IPersonRepositoryDoor {

    public List<Person> findAll();
    public Person findById(long id);
}
