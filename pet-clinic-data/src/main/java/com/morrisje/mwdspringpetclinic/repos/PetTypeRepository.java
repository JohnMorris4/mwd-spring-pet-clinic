package com.morrisje.mwdspringpetclinic.repos;

import com.morrisje.mwdspringpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
