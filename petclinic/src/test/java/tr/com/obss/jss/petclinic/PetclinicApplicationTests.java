package tr.com.obss.jss.petclinic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.com.obss.jss.petclinic.model.Admin;
import tr.com.obss.jss.petclinic.model.Role;
import tr.com.obss.jss.petclinic.model.Specialty;
import tr.com.obss.jss.petclinic.model.Vet;
import tr.com.obss.jss.petclinic.repository.AdminRepository;
import tr.com.obss.jss.petclinic.repository.RoleRepository;
import tr.com.obss.jss.petclinic.repository.SpecialtyRepository;
import tr.com.obss.jss.petclinic.repository.VetRepository;

import java.util.List;

@SpringBootTest
class PetclinicApplicationTests {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private VetRepository vetRepository;

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Test
    void contextLoads() {

        final Role adminRole = roleRepository.save(Role.builder().name("ADMIN").build());

        final Role userRole = roleRepository.save(Role.builder().name("USER").build());

        final Role vetRole = roleRepository.save(Role.builder().name("VET").build());

        final Specialty vetSpecialty = specialtyRepository.save(Specialty.builder().name("dentist").description("sadasd").build());

        final Vet vet = Vet.builder().name("Gökhan").surname("Akbas").address("Kadıkoy").city("Istanbul").specialties(List.of(vetSpecialty)).build();
        final Vet saveVet = vetRepository.save(vet);

        final Admin admin = Admin.builder().name("Murat").surname("Cakir").address("Besiktas").city("Istanbul").roles(List.of(adminRole)).build();
        final Admin savedAdmin = adminRepository.save(admin);

        final Admin admin1 = Admin.builder().name("Murat1").surname("Cakir1").address("Besiktas1").city("Istanbul1").roles(List.of(userRole)).build();
        final Admin savedAdmin1 = adminRepository.save(admin1);


        adminRepository.findById(savedAdmin.getId());

        adminRepository.findUserByNameOrderBySurnameDesc("Murat");

        adminRepository.findUserByCity("Istanbul");

        adminRepository.findUserByCityNative("Istanbul");
    }

}
