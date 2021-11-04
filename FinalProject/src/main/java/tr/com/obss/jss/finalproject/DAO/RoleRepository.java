package tr.com.obss.jss.finalproject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.com.obss.jss.finalproject.Model.Role;
import tr.com.obss.jss.finalproject.Model.RoleType;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(RoleType name);
}
