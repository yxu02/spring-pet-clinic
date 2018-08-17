package edu.sjsu.xuy87.springpetclinic.services.map;

import edu.sjsu.xuy87.springpetclinic.model.Pet;
import edu.sjsu.xuy87.springpetclinic.services.BaseCRUDService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Integer> implements BaseCRUDService<Pet, Integer> {
    @Override
    public Pet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(), obj);
    }
}
