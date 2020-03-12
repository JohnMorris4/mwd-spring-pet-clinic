package com.morris_je.mwdspringpetclinic.services;

import com.morris_je.mwdspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
