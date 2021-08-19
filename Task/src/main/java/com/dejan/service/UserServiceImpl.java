package com.dejan.service;

import com.dejan.model.User;
import com.dejan.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo =
                userRepo;
    }

    @Override
    public User save(User user) {
        userRepo.save(user);

        return user;
    }

    @Override
    public void delete(Long id) {

        userRepo.deleteById(id);
    }


    @Override
    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User findUserbyId(Long id) {
            return userRepo.getById(id);


    }
}
