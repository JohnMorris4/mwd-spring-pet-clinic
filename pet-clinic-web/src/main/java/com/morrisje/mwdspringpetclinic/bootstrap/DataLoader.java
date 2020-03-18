package com.morrisje.mwdspringpetclinic.bootstrap;

import com.morrisje.mwdspringpetclinic.model.Owner;
import com.morrisje.mwdspringpetclinic.model.Vet;
import com.morrisje.mwdspringpetclinic.services.OwnerService;
import com.morrisje.mwdspringpetclinic.services.VetService;
import com.morrisje.mwdspringpetclinic.services.map.OwnerServiceMap;
import com.morrisje.mwdspringpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetService vetService;
    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
//        owner1.setAddress("123 Brickerel");
//        owner1.setCity("Miami");
//        owner1.setTelephone("1231231234");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
//        owner2.setAddress("123 Brickerel");
//        owner2.setCity("Miami");
//        owner2.setTelephone("1231231234");

        ownerService.save(owner1);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
//        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
//        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");



    }
}
