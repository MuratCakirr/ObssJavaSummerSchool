package tr.com.obss.jss.petclinic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.obss.jss.petclinic.model.Vet;
import tr.com.obss.jss.petclinic.repository.VetRepository;
import tr.com.obss.jss.petclinic.service.VetService;

import java.util.List;

@Service
public class VetServiceImpl implements VetService {

    private VetRepository vetRepository;

    @Autowired
    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Vet createNewVet(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public List<Vet> searchVetsByName(String name) {
        return null;
    }

    @Override
    public Vet findById(Long vetId) {
        return null;
    }
}
