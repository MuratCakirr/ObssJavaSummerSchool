package tr.com.obss.jss.finalproject.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.obss.jss.finalproject.DAO.UserRepository;
import tr.com.obss.jss.finalproject.Exception.UserNotFoundException;
import tr.com.obss.jss.finalproject.Model.User;
import tr.com.obss.jss.finalproject.Results.DataResult;
import tr.com.obss.jss.finalproject.Results.Result;
import tr.com.obss.jss.finalproject.Results.SuccessDataResult;
import tr.com.obss.jss.finalproject.Results.SuccessResult;
import tr.com.obss.jss.finalproject.Service.UserService;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Result addUser(User user) {
        userRepository.save(user);
        return new SuccessResult("User added");
    }

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new SuccessDataResult<User>(userRepository.getByEmail(email),"User found");
    }

    @Override
    public User findByUsername(String username) {
        Objects.requireNonNull(username, "username cannot be null");
        return userRepository.findByUsername(username).orElseThrow(UserNotFoundException::new);
    }

    @Override
    public Boolean existsByUsername(String username) {
        Objects.requireNonNull(username, "username cannot be null");
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        Objects.requireNonNull(email, "email cannot be null");
        return userRepository.existsByEmail(email);
    }

    @Override
    public User createNewUser(User user) {
        return userRepository.save(user);
    }



}
