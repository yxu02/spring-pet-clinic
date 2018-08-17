package edu.sjsu.xuy87.springpetclinic.services;

import java.util.Set;

public interface BaseCRUDService<T, ID> {

    T findById(ID id);

    Set<T> findAll();

    T save(T obj);

    void deleteById(ID id);

    void delete(T obj);
}
