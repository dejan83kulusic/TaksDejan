package com.dejan.service;

import com.dejan.model.User;
import com.dejan.repository.UserRepo;

import java.util.List;

public interface UserService extends UserRepo{

    User save(User user);
    void delete(Long id);
    List<User> findAllUser();
    User findUserbyId(Long id);

}
