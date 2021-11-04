package tr.com.obss.jss.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tr.com.obss.jss.petclinic.model.Admin;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    
    List<Admin> findUserByNameOrderBySurnameDesc(String name);

    @Query(value = "from Admin u where u.city = :city")
    List<Admin> findUserByCity(String city);

    @Query(value = "select * from admin where city = :city",nativeQuery = true)
    List<Admin> findUserByCityNative(String city);

}
