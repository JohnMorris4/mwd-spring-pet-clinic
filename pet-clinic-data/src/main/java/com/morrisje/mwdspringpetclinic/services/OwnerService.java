package com.morrisje.mwdspringpetclinic.services;

import com.morrisje.mwdspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
