package tr.com.obss.jss.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tr.com.obss.jss.petclinic.model.Vet;
import tr.com.obss.jss.petclinic.service.AdminService;
import tr.com.obss.jss.petclinic.service.VetService;

@RestController("/vet")
public class VetController {
    private VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @PostMapping("/post")
    public Vet createNewVet(@RequestBody Vet vet){
        return vetService.createNewVet(vet);
    }
}
