package tr.com.obss.jss.petclinic.service;

import tr.com.obss.jss.petclinic.model.Admin;
import tr.com.obss.jss.petclinic.model.Vet;

import java.util.List;

public interface VetService {

    Vet createNewVet(Vet vet);

    List<Vet> searchVetsByName(String name);

    Vet findById(Long vetId);

}
