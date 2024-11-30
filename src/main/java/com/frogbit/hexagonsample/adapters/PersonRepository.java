package com.frogbit.hexagonsample.adapters;

import com.frogbit.hexagonsample.domain.doorOut.DefaultRepository;

import java.util.List;

public class PersonRepository implements DefaultRepository {

    @Override
    public <T> List<T> findAll() {
        return List.of();
    }

    @Override
    public <T> void add(T item) {

    }
}
