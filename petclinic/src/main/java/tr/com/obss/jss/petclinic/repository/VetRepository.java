package tr.com.obss.jss.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tr.com.obss.jss.petclinic.model.Admin;
import tr.com.obss.jss.petclinic.model.Vet;

import java.util.List;

public interface VetRepository extends JpaRepository<Vet,Long> {

    List<Vet> findUserByNameOrderBySurnameDesc(String name);

    @Query(value = "from Vet v where v.city = :city")
    List<Vet> findUserByCity(String city);

    @Query(value = "select * from vet where city = :city",nativeQuery = true)
    List<Vet> findUserByCityNative(String city);

}
