package com.frogbit.hexagonsample.domain.doorIn;

import com.frogbit.hexagonsample.domain.entities.Person;
import java.util.List;

public interface IPersonService {
    public List<Person> findAll();
    public Person findById(long id);
}
