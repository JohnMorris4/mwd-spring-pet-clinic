package com.morrisje.mwdspringpetclinic.repos;

import com.morrisje.mwdspringpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
