package com.example.SpringBootBuilding.controllers;

import com.example.SpringBootBuilding.entities.User;
import com.example.SpringBootBuilding.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping(path = "/users")
    public User createNewUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping(path = "/users/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        return userService.getUserById(id);
    }

    @PutMapping(path = "/users/{id}")
    public User updateUserById(@PathVariable("id") Long id, @RequestBody User user) {
        return userService.updateUserById(id, user);
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping(path = "/users/byusername/{username}")
    public User getUserByUsername(@PathVariable("username") String username) {

        return userService.getUserByUsername(username);
    }

}
