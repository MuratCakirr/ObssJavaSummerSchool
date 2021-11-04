package tr.com.obss.jss.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.com.obss.jss.petclinic.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
}
