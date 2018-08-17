package edu.sjsu.xuy87.springpetclinic.services;


import edu.sjsu.xuy87.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(int id);

    Set<Owner> findAll();

    Owner findByLastName(String lastName);

    Owner save(Owner owner);
}
