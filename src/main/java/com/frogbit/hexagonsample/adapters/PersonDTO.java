package com.frogbit.hexagonsample.adapters;

import java.util.Date;

public class PersonDTO {
    private int id;
    private String name;
    private Date birthDate;

    public PersonDTO(){}

    public PersonDTO(int id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public PersonDTO(PersonEntity entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.birthDate = entity.getBirthDate();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
