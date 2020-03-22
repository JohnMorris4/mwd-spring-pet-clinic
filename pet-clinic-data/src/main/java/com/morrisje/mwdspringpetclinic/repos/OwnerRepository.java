package com.morrisje.mwdspringpetclinic.repos;

import com.morrisje.mwdspringpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
