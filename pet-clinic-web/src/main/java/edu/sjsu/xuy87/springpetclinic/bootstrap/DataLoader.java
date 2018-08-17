package edu.sjsu.xuy87.springpetclinic.bootstrap;

import edu.sjsu.xuy87.springpetclinic.model.Owner;
import edu.sjsu.xuy87.springpetclinic.model.Vet;
import edu.sjsu.xuy87.springpetclinic.services.OwnerService;
import edu.sjsu.xuy87.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2);
        owner2.setFirstName("Johnny");
        owner2.setLastName("DoeMar");
        ownerService.save(owner2);

        Vet vet1=new Vet();
        vet1.setId(1);
        vet1.setFirstName("Vlad");
        vet1.setLastName("Peppa");
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setId(2);
        vet2.setFirstName("Mike");
        vet2.setLastName("Zhang");
        vetService.save(vet2);
    }
}
