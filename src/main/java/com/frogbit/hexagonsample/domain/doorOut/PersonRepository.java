package com.frogbit.hexagonsample.domain.doorOut;

import com.frogbit.hexagonsample.domain.entities.Person;

import java.util.List;

public interface PersonRepository {
    public List<Person> findAll();
    public void add(Person person);
}
