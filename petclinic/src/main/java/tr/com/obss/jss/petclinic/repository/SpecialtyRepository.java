package tr.com.obss.jss.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.obss.jss.petclinic.model.Specialty;

public interface SpecialtyRepository extends JpaRepository<Specialty,Long> {
}
