package edu.sjsu.xuy87.springpetclinic.services.map;

import edu.sjsu.xuy87.springpetclinic.model.Pet;
import edu.sjsu.xuy87.springpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Integer> implements PetService {
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
