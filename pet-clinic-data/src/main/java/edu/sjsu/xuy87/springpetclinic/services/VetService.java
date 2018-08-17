package edu.sjsu.xuy87.springpetclinic.services;

import edu.sjsu.xuy87.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(int id);

    Set<Vet> findAll();

    Vet save(Vet vet);
}
