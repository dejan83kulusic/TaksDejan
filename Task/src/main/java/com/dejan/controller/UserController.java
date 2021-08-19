package com.dejan.controller;


import com.dejan.model.User;
import com.dejan.service.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("api")
public class UserController{

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService =
                userService;
    }


    @GetMapping("/getUsers")
    List<User> all() {
        return userService.findAllUser();
    }


    @PostMapping("/postUsers")
    User newUser(@RequestBody User newUser) {
        return userService.save(newUser);
    }



    @GetMapping("/getUsers/{id}")
    User one(@PathVariable Long id) {

            return userService.findUserbyId(id);

    }




    @DeleteMapping("/deleteUsers/{id}")
    void deleteEmployee(@PathVariable Long id) {
        userService.delete(id);
    }

}
