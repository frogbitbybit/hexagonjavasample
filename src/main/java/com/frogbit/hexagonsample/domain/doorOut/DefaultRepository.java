package com.frogbit.hexagonsample.domain.doorOut;

import java.util.List;

public interface DefaultRepository {
    public <T> List<T> findAll();
    public <T> void add(T item);
}
