package edu.sjsu.xuy87.springpetclinic.services.map;

import edu.sjsu.xuy87.springpetclinic.model.Owner;
import edu.sjsu.xuy87.springpetclinic.services.BaseCRUDService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements BaseCRUDService<Owner, Integer> {
    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public Owner save(Owner obj) {
        return super.save(obj.getId(), obj);
    }
}
