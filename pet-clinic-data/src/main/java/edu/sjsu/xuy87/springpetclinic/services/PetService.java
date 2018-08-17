package edu.sjsu.xuy87.springpetclinic.services;

import edu.sjsu.xuy87.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(int id);

    Set<Pet> findAll();

    Pet save(Pet pet);
}
