package com.dejan.service;

import com.dejan.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    void delete(Long id);
    List<User> findAllUser();
    User findUserbyId(Long id);

}
