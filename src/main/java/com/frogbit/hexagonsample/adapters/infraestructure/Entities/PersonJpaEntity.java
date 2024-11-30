package com.frogbit.hexagonsample.adapters.infraestructure.Entities;

import com.frogbit.hexagonsample.domain.entities.Person;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="person")
public class PersonJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date birthDate;

    public PersonJpaEntity(){}

    public PersonJpaEntity(int id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static PersonJpaEntity fromDomain(Person entity){

        return new PersonJpaEntity(
                entity.getId(),
                entity.getName(),
                entity.getBirthDate());
    }

    public Person toDomain(){
        return new Person(
                this.getId(),
                this.getName(),
                this.getBirthDate());
    }
}
