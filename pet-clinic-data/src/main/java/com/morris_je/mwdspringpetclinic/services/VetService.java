package com.morris_je.mwdspringpetclinic.services;

import com.morris_je.mwdspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
