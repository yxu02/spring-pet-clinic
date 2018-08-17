package edu.sjsu.xuy87.springpetclinic.services.map;

import edu.sjsu.xuy87.springpetclinic.model.Owner;
import edu.sjsu.xuy87.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements OwnerService {
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

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
