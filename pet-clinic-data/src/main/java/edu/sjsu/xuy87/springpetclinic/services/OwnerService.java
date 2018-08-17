package edu.sjsu.xuy87.springpetclinic.services;


import edu.sjsu.xuy87.springpetclinic.model.Owner;

public interface OwnerService extends BaseCRUDService<Owner, Integer>{

    Owner findByLastName(String lastName);

}
