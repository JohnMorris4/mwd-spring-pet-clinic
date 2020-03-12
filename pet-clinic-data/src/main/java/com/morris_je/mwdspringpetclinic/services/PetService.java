package com.morris_je.mwdspringpetclinic.services;

import com.morris_je.mwdspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
