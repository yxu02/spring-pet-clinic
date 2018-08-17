package edu.sjsu.xuy87.springpetclinic.services.map;

import edu.sjsu.xuy87.springpetclinic.model.Vet;
import edu.sjsu.xuy87.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Integer> implements VetService {
    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(), obj);
    }
}
