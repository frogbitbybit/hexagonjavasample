package com.frogbit.hexagonsample.adapters.infraestructure.Repositories;

import com.frogbit.hexagonsample.adapters.infraestructure.Entities.PersonJpaEntity;
import com.frogbit.hexagonsample.adapters.infraestructure.JpaRepositories.PersonJpaRepository;
import com.frogbit.hexagonsample.domain.doorOut.IPersonRepositoryDoor;
import com.frogbit.hexagonsample.domain.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository implements IPersonRepositoryDoor {

    private final PersonJpaRepository jpaRepository;


    public PersonRepository(PersonJpaRepository jpaRepository){
        this.jpaRepository = jpaRepository;
    }

    public List<Person> findAll(){

        List<PersonJpaEntity> jpaPeople = jpaRepository.findAll();

        List<Person> people = new ArrayList<Person>();

        for(PersonJpaEntity person : jpaPeople){

            people.add(person.toDomain());
        }

        return people;
    }

    public Person findById(long id){
        return jpaRepository.findById(id).get().toDomain();
    }

    public void savePerson(Person entity){
        PersonJpaEntity jpaEntity = PersonJpaEntity.fromDomain(entity);
        jpaRepository.save(jpaEntity);
    }
}
