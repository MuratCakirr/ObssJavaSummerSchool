package tr.com.obss.jss.finalproject.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.obss.jss.finalproject.Model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User getByEmail(String email);

    Boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);


}
