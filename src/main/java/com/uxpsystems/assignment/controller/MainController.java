package com.uxpsystems.assignment.controller;

import com.uxpsystems.assignment.model.User;
import com.uxpsystems.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public User getUser(@RequestParam(name="id", required=true) Long id) {
        return userService.getUser(id);
    }

    @PutMapping("/user")
    public boolean addUser(@RequestBody User newUser) {
        userService.addUser(newUser);

        return true;
    }

    @PostMapping("/user")
    public boolean updateUser(@RequestBody User user) {
        userService.updateUser(user);

        return true;
    }

    @DeleteMapping("/user")
    public boolean deleteUser(@RequestParam(name="id", required=true) Long id) {
        userService.deleteUser(id);

        return true;
    }

    @GetMapping("/users")
    public List<User> getUserTest() {
        return userService.getAllUsers();
    }
}
