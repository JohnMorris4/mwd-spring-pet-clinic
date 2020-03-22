package com.morrisje.mwdspringpetclinic.repos;

import com.morrisje.mwdspringpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
