package tr.com.obss.jss.finalproject.Service;

import tr.com.obss.jss.finalproject.Model.Product;
import tr.com.obss.jss.finalproject.Model.User;
import tr.com.obss.jss.finalproject.Results.DataResult;
import tr.com.obss.jss.finalproject.Results.Result;

import java.util.List;

public interface UserService {
    Result addUser(User user);

    List<User> findAllUser();

    User createNewUser(User user);

    DataResult<User> getByEmail(String email);

    User findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
